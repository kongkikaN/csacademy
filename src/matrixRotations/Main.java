package matrixRotations;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int n = Integer.parseInt(str);
		int [][] arr = new int[n][n];
		int [][] arr90 = new int[n][n];
		int [][] arr180 = new int[n][n];
		int [][] arr270 = new int[n][n];
		int [][] b = new int[n][n];
		
		str = in.nextLine();
		for (int i = 0; i < n; i++) {
			str = in.nextLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(j));
				b[i][j] = 0;
			}
		}
		
		
		//reverse array 90 degrees
		arr90 = rotateMatrix(arr, n);
		arr180 = rotateMatrix(arr90, n);
		arr270 = rotateMatrix(arr180, n);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					b[i][j] = 1;
				}
				else if (arr90[i][j] == 1) {
					b[i][j] = 1;
				}
				else if (arr180[i][j] == 1) {
					b[i][j] = 1;
				}
				else if (arr270[i][j] == 1) {
					b[i][j] = 1;
				}
				
				
			}
		}
		
		
//		System.out.println("print Array 90 degrees");
//		printArr(arr90);
//		System.out.println("print Array 180 degrees");
//		printArr(arr180);
//		System.out.println("print Array 270 degrees");
//		printArr(arr270);
//		System.out.println("b");
		printArr(b);
	}
	
	public static int[][] rotateMatrix(int[][] arr, int n){
		int k = 0;
		int [][] arr90 = new int[n][n];
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j<n; j++) {
				arr90[k][j] = arr[j][i];
			}
			k++;
		}
		return arr90;
	}
	
	public static void printArr(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
