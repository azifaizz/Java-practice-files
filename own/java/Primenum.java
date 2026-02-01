package own.java;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		int n = 17;
		int a =1;
		for(int i =2;i<=n/2;i++) {
			if(n%i==0) {
				a = 0;
			}
		}
		if(a==1&&n!=1) {
			System.out.print("Prime");
		}else {
			System.out.print("Not prime");
		}
		}
	
	}