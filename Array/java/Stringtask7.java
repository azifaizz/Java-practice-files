package Array.java;

public class Stringtask7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Jackkkkk of all trades";
		String word = "";
		String lrgwrd = "";
		for(int i = 0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch!=' ') {
				word = word + ch;
			}else {
				if(word.length()>lrgwrd.length()) {
					lrgwrd = word;
				}
				word = "";
			}
		}
		if(word.length()>lrgwrd.length()) {
			lrgwrd = word;
		}
		System.out.println(lrgwrd);
	}
}
