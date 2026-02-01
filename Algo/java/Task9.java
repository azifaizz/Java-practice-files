package Algo.java;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {5, 2, 9, 1, 3};

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[i]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	}

}
