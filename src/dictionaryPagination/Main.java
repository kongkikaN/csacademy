package dictionaryPagination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		ArrayList <String> arr = new ArrayList<String>(); //the dictionary
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int N = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int Q = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		for (int i = 0; i < N; i++) {
			str = in.nextLine();
			arr.add(str);
		}
		Collections.sort(arr);
		
		for (int i = 0; i < Q; i++) {
			str = in.nextLine();
			String query = Arrays.asList(str.trim().split(" ")).get(0);
			int split = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
			
			int index = arr.indexOf(query) + 1;
			int ans = (int) Math.ceil(arr.indexOf(query) / split) +1;
			
			System.out.println(ans);
		}
	}
}
