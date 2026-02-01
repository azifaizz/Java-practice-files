package Algo.java;

public class TaskA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,7,-7};
		int pos = 0;
		int neg = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]<0)neg++;
			else if(a[i]>0)pos++;
		}
		System.out.println("The Pos numbers are:"+pos);
		System.out.println("The neg numbers are:"+neg);
	}
}
