package Algo.java;

public class TaskG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int count = 0;
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>num) {
				count++;
			}else {
				count = 0;
			}
		}
		System.out.println(count);
	}

}
