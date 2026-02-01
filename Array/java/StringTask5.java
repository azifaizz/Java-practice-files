package Array.java;
import java.util.Arrays;
public class StringTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "olleH";
		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");
		str1= str1.toLowerCase();
		str2= str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("This is not a annnagram");
			return;
		}
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a,b)) {
			System.out.println("This is ana gram");
		}else {
			System.out.println("This is not an anagram");
		}
		
	}

}
