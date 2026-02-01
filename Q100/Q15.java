package Q100;

import java.util.Scanner;

public class Q15 {
	static void stumarkchecker() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stu name:");
		String name =sc.next();
		System.out.println("Enter Mark1:");
		double m1 =sc.nextDouble();
		System.out.println("Enter Mark2:");
		double m2 =sc.nextDouble();
		System.out.println("Enter Mark3:");
		double m3 =sc.nextDouble();
		System.out.println("Enter Mark4:");
		double m4 =sc.nextDouble();
		System.out.println("name:"+name);
		if(m1<35||m2<35||m3<35||m4<35) {
			System.out.println("Failed");
		}else {
			System.out.println("Passed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stumarkchecker();
	}

}
