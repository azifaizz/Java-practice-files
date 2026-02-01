package wtt.aseel.java;
public class ReverseStrig {
	public static void main(String[] args) {
		String str = "leesa";
		String rev ="";
		for(int i = str.length()-1;i>=0;i--){
			rev = rev+str.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
	}
}
