package Array.java;

public class TwoD2 {

	public static void main(String[] args) {
		//printing array
		int arr[][]= {{1,2,3},{4,5,6},{7,9,8}};
		System.out.println(arr[1][1]);
		
		
		//sum of array
		int arrr[][]= {{2,4,6},{6,7,8},{2,3,4}};
		int sum = 0;
		for(int i =0;i<arrr.length;i++) {
			for(int j = 0;j<arrr.length;j++) {
				sum = sum + arrr[i][j];
			}
		}
			System.out.println("sum "+sum);
	}
}
