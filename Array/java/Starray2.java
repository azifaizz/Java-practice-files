package Array.java;

public class Starray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,6,7,8,9,0,1};
		int  r =5;
		for(int i =0;i<r;i++) {
			int temp = arr[i];
			arr[i]=arr[i+r];
			arr[i+r]=temp;
				
		}
		for(int x = 0;x<arr.length;x++) {
			System.out.println(x+" ");
		}
		}
}

