package own.java;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
        for(int ln = 1;ln<=n;ln++){
            for(int sp = 1;sp<=n-ln+1;sp++){
                System.out.print(" ");
            }
            for(int col = 1;col<=ln;col++){
                System.out.print("*");
            }
                System.out.println(" ");
        }
        for(int ln = n-1;ln>=1;ln--) {
        	for(int sp = n;sp>=ln;sp--) {
        		System.out.print(" ");
        	}
        	for(int col = 1;col<=ln;col++) {
        		System.out.print("*");
        }
        		System.out.println(" ");
}
}
}