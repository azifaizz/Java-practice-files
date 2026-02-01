package Algo.java;

public class TaskE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,87,66,33,2,5,7,55,66,12,5, 11, 22, 55, 110, 15, 33};
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%5==0 && arr[i]%11==0) {
				count++;
			}
		}
		System.out.println("The count is :"+count);
	}

}
