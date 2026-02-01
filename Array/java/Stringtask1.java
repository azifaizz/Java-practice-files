package Array.java;

public class Stringtask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		StringBuilder a = new StringBuilder(str);
		String reversed = a.reverse().toString();
		if(str.equals(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
