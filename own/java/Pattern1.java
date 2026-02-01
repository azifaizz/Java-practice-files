package own.java;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int n = sc.nextInt();
			for(int ln =1;ln<=n;ln++) {
				for(int col = 1;col<=n;col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}
}
