package minPairing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(str);
		str = in.nextLine();
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i)));
		}

		Collections.sort(arr);
		int sum = 0;
		for (int i = 0; i < n - 1; i+=2) {
			sum += Math.abs(arr.get(i) - arr.get(i+1));
		}
		System.out.println(sum);
	}

}
