package Array.java;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={5,2,3,4,5,6,7,30,20,50};
		int min =arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
			System.out.println("Min num is "+min);

	}

}
