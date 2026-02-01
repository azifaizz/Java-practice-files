package Array.java;
public class Linear {
	public static void main(String[] args) {
		int num = 1;
		int arr[]= {1,2,3,4,56};
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==num)System.out.println("Number found in index "+i);
			else System.out.println("Number not found in index "+i);
		}
	}
}