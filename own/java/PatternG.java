package own.java;
import java.util.Scanner;

public class PatternG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		for(int ln = n;ln>=n;ln--){
			for(int col = 1;col<=n-ln+1;col++) {
				System.out.print(ln+" ");
			}
				System.out.println(" ");
		}

	}

}
