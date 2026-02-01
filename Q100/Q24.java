package Q100;

import java.util.Arrays;

public class Q24 {
	static boolean isAnagram(String s1,String s2) {
		s1 = s1.replace(" ", "").toLowerCase();
		s2 = s2.replace(" ", "").toLowerCase();
		if(s1.length()!=s2.length())
		return false;
		char[] a1= s1.toCharArray();
		char[] a2= s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("java", "ayaj"));
        System.out.println(isAnagram("java", "jvaa"));

	}

}
