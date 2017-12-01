package flipGame;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0)); //rows
		int m = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1)); //cols
		
		int [][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(j));
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i][0] == 0) {
				//flipRow(arr[i][0]);
				for (int j = 0; j < m; j++) {
					if (arr[i][j] == 0) {
						arr[i][j] = 1;
					}
					else {
						arr[i][j] = 0;
					}
				}
			}
		}
		
		
		for (int j = 1; j < m; j++) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (arr[i][j] == 0) {
					count++;
				}
			}
			if (count > n/2) {
				//flip
				for (int i = 0; i < n; i++) {
					if (arr[i][j] == 0) {
						arr[i][j] = 1;
					}
					else {
						arr[i][j] = 0;
					}
				}
			}
			
		}
		printTable (arr, n, m);
		printOutput(arr, n, m);
	}
	
	public static void printOutput(int[][] arr, int n, int m) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					sum = (int) (sum + Math.pow(2, m-j-1));
				}
			}
		}
		System.out.println(sum);
	}
	public static void printTable(int[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
