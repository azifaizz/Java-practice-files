package Algo.java;

public class TaskF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,6,7,8,9,7};
		boolean sorted = true;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted = false;
				break;
			}
		}
		if(sorted) {
			System.out.println("The numbers are sorted");
		}else {
			System.out.println("The numbers are not sorted");
		}
	}
}
