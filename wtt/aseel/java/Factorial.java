package wtt.aseel.java;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		int i = sa.nextInt();
		int fact = 1;
		for(i=1;i<=5;i++) {
			fact = fact*i;
		}
		System.out.print(fact);
	}
}
