package Exception;

import java.util.Scanner;

public class EXP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter mark2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter mark3: ");
        int m3 = sc.nextInt();
        try {
        	if(m1==0||m2==0||m3==0) {
        		int x=10/0;
        	}else {
        		int avg = m1+m2+m3;
        		System.out.println("Avg "+avg);
        	}
        }catch(Exception e){
        	System.out.println("invalid");
        }

	}

}
