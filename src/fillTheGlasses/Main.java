package fillTheGlasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int k = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		str = in.nextLine();
		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i)));
		}
		
		Collections.sort(arr);
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr.get(i);
		}
		
		int res = (int) Math.ceil(sum/100.0);
		System.out.println(res);
	}
}
