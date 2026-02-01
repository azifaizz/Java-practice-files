package wtt.aseel.java;

public class Pal {

	public static void main(String[] args) {
		int num = 2012;
		int rev = 0;
		int temp = num;
		while(temp!=0) {
			int digit = temp%10;
			rev = rev*10+digit;
			temp = temp/10;
		}
		if(num==rev) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome");
		}
	}

}
