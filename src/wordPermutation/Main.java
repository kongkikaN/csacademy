package wordPermutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String str;
		ArrayList <Word> words = new ArrayList <Word>();
		
		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			words.add(new Word(str, i+1));
		}
		//printWord(words);
		Collections.sort(words, new MyComparator());
		//printWord(words);
		printOutput(words);
	}
	
	public static void printWord(ArrayList <Word> words) {
		for (Word word : words) {
			System.out.println(word.word + " " + word.position);
		}
	}
	
	public static void printOutput(ArrayList <Word> words) {
		for (Word word : words) {
			System.out.print(word.position + " ");
		}
	}
}
