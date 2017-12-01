package productOfFive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		ArrayList <Integer> arr = new ArrayList<Integer>();
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		
		String str = in.nextLine();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i)));
		}
		Collections.sort(arr);
		int max = 0;
		
		if (arr.get(n-1)*arr.get(n-2)*arr.get(n-3)*arr.get(n-4)*arr.get(n-5) > max) {
			max = arr.get(n-1)*arr.get(n-2)*arr.get(n-3)*arr.get(n-4)*arr.get(n-5);
		}
		if (arr.get(0)*arr.get(1)*arr.get(n-1)*arr.get(n-2)*arr.get(n-3) > max) {
			max = arr.get(0)*arr.get(1)*arr.get(n-1)*arr.get(n-2)*arr.get(n-3);
		}
		if (arr.get(0)*arr.get(1)*arr.get(2)*arr.get(3)*arr.get(n-1) > max) {
			max = arr.get(0)*arr.get(1)*arr.get(2)*arr.get(3)*arr.get(n-1);
		}
		if (arr.get(n-1) < 0) {
			max = arr.get(n-1)*arr.get(n-2)*arr.get(n-3)*arr.get(n-4)*arr.get(n-5);
		}
		if (arr.size() == 5) {
			max = arr.get(0) * arr.get(1) * arr.get(2) * arr.get(3) * arr.get(4);
		}
		System.out.println(max);
	}
}
