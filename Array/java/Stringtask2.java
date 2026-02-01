package Array.java;

public class Stringtask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		str = str.toLowerCase();
		int vowels = 0;
		int constants = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
				if(ch>='a'&&ch<'z') {
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						vowels++;
					}else {
						constants++;
					}
				}
		}
		System.out.println("Vowels"+vowels);
		System.out.println("Constants"+constants);

	}

}
