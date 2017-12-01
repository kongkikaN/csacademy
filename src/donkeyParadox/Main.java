package donkeyParadox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));		// n : rows
		int m = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));		// m : cols
		
																					// 2<= n, m <= 200
		//ArrayList <Cell> cells = new ArrayList <Cell>();
		str = in.nextLine();
		int hay1x = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int hay1y = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		str = in.nextLine();
		int hay2x = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int hay2y = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (distance(hay1x, hay1y, i + 1, j + 1) == distance(hay2x, hay2y, i + 1, j + 1)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static int distance(int x1, int y1, int x2, int y2) {
		return (Math.abs(x1-x2) + Math.abs(y1-y2));
	}
}


