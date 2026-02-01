package Array.java;

import java.util.Scanner;

public class TwoD4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r = sc.nextInt();
		System.out.print("Enter the number of cols: ");
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		int[][] sum = new int[r][c];
		System.out.println("Enter the A array: ");
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the B array: ");
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				b[i][j] = sc.nextInt();
	}

}
		for(int i = 0;i<r;i++) {
			for(int j = 0;j<c;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
				System.out.println(" ");
			}
		}
	}
}
