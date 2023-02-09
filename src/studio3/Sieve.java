package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your maximum value.");
		int max = scan.nextInt();
		boolean num[] = new boolean[max];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = true;
		}
		for (int i = 2; i < Math.sqrt(max); i++) {
			if (num[i] == true) {
				for (int j = (i*i); j < max; j = j + i) {
					num[j] = false;
				}
			}
		}
		
		System.out.println("Here are all of the prime numbers upto " + max + ": ");
		for (int i = 2; i < num.length; i++) {
			if (num[i] == true) {
				System.out.println(i);
			}
		}

	}

}
