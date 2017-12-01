package frequentNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
		int k = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));
		ArrayList <Integer> numbers = new ArrayList<Integer>();
		ArrayList <Integer> same = new ArrayList<Integer>();
		str = in.nextLine();
		int number;
		int output = 0;
		int timesItAppeared = 0;
		int size;
		
		for (int i = 0; i < n; i++) {
			number = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i));
			numbers.add(number);
		}
		
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(i) == numbers.get(j) && !same.contains(numbers.get(i))) {
					timesItAppeared++;
				}
			}
			if (timesItAppeared >= k) {
				output++;
			}
			
			same.add(numbers.get(i));
		}
		timesItAppeared = 0;
		System.out.println(output);
	}

}
