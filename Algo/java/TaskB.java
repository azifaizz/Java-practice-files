package Algo.java;

public class TaskB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,0,0,0,1,2};
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]==0)count++;
		}
		System.out.println("Te count is:"+count);
	}
}
