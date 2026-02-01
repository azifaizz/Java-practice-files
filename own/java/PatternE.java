package own.java;

import java.util.Scanner;

public class PatternE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for(int ln = 1;ln<=n;ln++) {
			for(int col = 1;col<=ln;col++) {
				if((ln+col)%2==0) {
					System.out.print("0");
			}
				else {
					System.out.print("1");
				}
		}
					System.out.println(" ");
	}

}
}
