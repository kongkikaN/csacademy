package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		ArrayList <String> words = new ArrayList <String>();
		
		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			words.add(sorted);
		}
		int max = 0;
		int count = 1;
		Collections.sort(words);
		if (words.size() > 1) {
			for (int i = 1; i < words.size(); i++) {
				if (words.get(i).equals(words.get(i-1))) {
					count++;
				}
				else
					count = 1;
				if (max < count) {
					max = count;
				}
			}
			System.out.println(max);
		}
		else
			System.out.println("1");
	}
}
