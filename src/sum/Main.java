package sum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		int x = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int y = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		
		System.out.println(x+y);
	}
}
