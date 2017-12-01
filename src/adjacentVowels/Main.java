package adjacentVowels;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String str = in.nextLine();
		ArrayList <Character> vowels = new ArrayList<Character>();
		
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if (vowels.contains(str.charAt(i-1)) && vowels.contains(str.charAt(i)))
				count++;
		}
		System.out.println(count);
	}
}
