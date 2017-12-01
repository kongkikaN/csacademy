package openTheBottles;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			String str = in.nextLine();
			int min = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
			int a = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
			int b = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(2));
			
			if (a < min)
				min = a;
			if (b < min)
				min = b;
			sum += min;
		}
		System.out.println(sum);
	}
}
