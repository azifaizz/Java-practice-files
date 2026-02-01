package Array.java;

public class Starray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int n = 2;
		for(int j = 0;j<n;j++) {
			int t = a[0];
		for(int i = 0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=t;
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		}
		

	}
