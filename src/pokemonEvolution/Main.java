package pokemonEvolution;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str = in.nextLine();
		int n = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(0));	// pokemons i have
		int m = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(1));	//pokemon candy bars
		int x = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(2));	//price of evolving a pokemon
		int y = Integer.parseInt(Arrays.asList(str.trim().split(" ")).get(3));	//candy bars i get selling a pokemon

		int a = 0; //pokemons i have evolved
		//while i have enough pokemon bars
		
		while (n * x > m) {
			n--;
			m = m + y;
		}
		System.out.println(n);
		
		/*
		for (int i = 0; i <= n; i++) {
			if (m + (n-i) * y >= i * x) {
				a = i;
			}
		}
		System.out.println(a);
		*/
		/*
		int low = 0;
		int high = n;
		
		while (high >= low) {
			int mid = (low + high)/2;
			if (m + (n-mid) * y >= mid * x) {
				a = mid;
				low = mid + 1;
			}
			else if (m + (n-mid) * y < mid * x) {
				high = mid - 1;
			}
		}
		System.out.println(a);
		*/
		//a = (m + n*y)/(y + x);
		//System.out.println(a);
	}
}
