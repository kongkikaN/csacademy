package shoePairs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		ArrayList <Shoe> arr = new ArrayList<Shoe>();
		int pairs = 0;
		
		
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			int size = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));
			char LorR = Arrays.asList(str.trim().split(" ")).get(1).charAt(0);
			arr.add(new Shoe(size, LorR));
		}
		
		
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i+1; j < arr.size(); j++) {
				if (!arr.get(i).getPaired()) {
					if (!arr.get(j).getPaired()) {
						if (arr.get(i).getSize() == arr.get(j).getSize()) {
							if (arr.get(i).getLorR() != arr.get(j).getLorR()) {
								arr.get(i).setPaired();
								arr.get(j).setPaired();
								pairs++;
							}
						}
					}
				}
			}
		}
		System.out.println(pairs);
	}
}
