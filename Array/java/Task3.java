package Array.java;

public class Task3 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,7,8,9};
		int odd = 0;
		int even = 0;
		for(int x = 1;x<arr.length;x++) {
			if(arr[x]%2==0)even++;
			else odd++;
		}
			System.out.println("odd "+odd);
			System.out.println("even "+even);
	}
}
