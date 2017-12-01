package minMaxSubarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String str = in.nextLine();
		
		
		int min = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int max = min;
		int indexMin = 0, indexMax = 0;
		int current;
		int size = 1;
		
		for (int i = 1; i < n; i++) {
			current = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i));
			if (current <= min) {
				indexMin = i;
				if (current < min) {
					size = Math.abs(indexMax - indexMin) + 1;
				}
				if (current == min) {
					if (size > Math.abs(indexMax - indexMin)) {
						size = Math.abs(indexMax - indexMin) + 1;
					}
				}
				min = current;
			}
			if (current >= max) {
				indexMax = i;
				if (current > max) {
					size = Math.abs(indexMax - indexMin) + 1;
				}
				if (current == max) {
					if (size > Math.abs(indexMax - indexMin)) {
						size = Math.abs(indexMax - indexMin) + 1;
					}
				}
				max = current;
			}
		}
		System.out.println(size);	
	}
}
