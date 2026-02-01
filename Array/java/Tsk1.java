package Array.java;

public class Tsk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,30,5,6,7,50};
		int max = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			}
			System.out.println("LArge is "+max);
		}

	}

