package expectedDice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		ArrayList <Integer> dice1 = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			dice1.add(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i)));
		}
		str = in.nextLine();
		ArrayList <Integer> dice2 = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			dice2.add(Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(i)));
		}
		
		ArrayList <Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <6; j++) {
				arr.add(dice1.get(i) + dice2.get(j));
			}
		}
		
		Collections.sort(arr);
		System.out.println(arr);
		
		int count = 0;
		int temp = 0;
		int index = 0;
		
		for (int i = 0; i < 35; i++) {
			if (arr.get(i) == arr.get(i+1)) {
				temp++;
			}
			else if (arr.get(i) != arr.get(i+1))
			{
				if (count < temp) {
					count = temp;
					index = arr.get(i);
				}
				temp = 0;
			}
		}
		
		if (count < temp) {
			index = arr.get(35);
		}
		System.out.println(index);
	}
}
