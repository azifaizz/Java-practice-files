package wtt.aseel.java;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
//		int num = 10;
		Scanner sa = new Scanner(System.in);
		int num = sa.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<num;i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c+" ");
			
		}

	}

}
