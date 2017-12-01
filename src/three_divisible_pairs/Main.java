package three_divisible_pairs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(str);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int odds = 0;
		str = in.nextLine();
		for (int i = 0; i < n; i++) {
			
			int number = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i));
			arr.add(number);
		}
		
		for (int i = 0; i < n; i++) {
			int x = arr.get(i);
			for (int j = i; j < n; j++) {
				int y = arr.get(j);
				if ((x+y)%3 == 0) {
					odds++;
				}
			}
		}
		System.out.println(odds);
	}
}