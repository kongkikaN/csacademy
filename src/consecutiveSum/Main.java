package consecutiveSum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int sum = 0;
		int lowerBound = 1;
		int upperBound = n-1;
		
		
		
		for (int k = 2; k < n-1; k++) {
			for (int j = 2; j < n; j++) {
				if (k + k - j == n) {
					lowerBound = k - j;
					upperBound = k;
				}
			}
		}
//		
//		for (int i = 2; i < n-1; i++) {
//			//int temp = i;
//			if (i + i - 1 + i - 2 + i - 3 + i - 4 == n ) {
//				lowerBound = i - 4;
//				upperBound = i;
//			}
//		}
		System.out.println(lowerBound + " " + upperBound);
		
		
	}

}
