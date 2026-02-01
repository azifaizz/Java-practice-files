package Q100;

import java.util.Scanner;

public class Q1 {
	static boolean EmailChecker(String Email) {
		return Email.contains("@")&&Email.contains(".");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String Email = sc.next();
        if(EmailChecker(Email)) {
        	System.out.println("valid mail");
        }else {
        	System.out.println("invalid mail");
        }

	}

}
