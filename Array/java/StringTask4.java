package Array.java;

public class StringTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello _java _programming";
		String result = "";
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!='_') {
				result = result+ch;
			}
		}
		System.out.println(result);

	}

}
