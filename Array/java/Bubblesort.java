package Array.java;

public class Bubblesort {

	public static void main(String[] args) {
		int arr[]= {1,4,6,2,5};
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]){   //if < means as	c order
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			System.out.println("The sorted array is:");
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}

	}

}
