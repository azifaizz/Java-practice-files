package Algo.java;

public class TaskI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,20,5,6,7,90};
		int lar = 0;
		int seclar = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>lar) {
				seclar = lar;
				lar = arr[i];
			}else if(arr[i]>seclar && arr[i]<lar) {
				seclar = lar;
		}	
		}
		System.out.println("The lar is:"+lar);
		System.out.println("The slar is:"+seclar);
	}
}
