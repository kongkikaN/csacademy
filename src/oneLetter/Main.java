package oneLetter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(str);
		ArrayList <String> words = new ArrayList<String>();
		
		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);
			words.add(sorted);
		}
		
		//printWords(words);
		Collections.sort(words);
		
		//printWords(words);
		printFirstLetter(words);
	}
	
	public static void printFirstLetter(ArrayList<String> words) {
		for (String word : words) {
			System.out.print(word.charAt(0));
		}
	}
	public static void printWords(ArrayList<String> words) {
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}
