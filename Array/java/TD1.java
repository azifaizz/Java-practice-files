package Array.java;
import java.util.Scanner;
public class TD1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of cols: ");
		int c = sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int mul[][]=new int[r][c];
		System.out.print("Enter the A matrices: ");
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the B matrices: ");
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		
		
}
}
