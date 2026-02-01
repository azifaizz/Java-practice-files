package Array.java;

public class Stringtask8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbeeeegg";
		String result = "";
		int count = 1;
		for(int i = 0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count = count + 1;
			}else {
				result = result+str.charAt(i)+count;
				count = 1;
			}
		}
		System.out.println(result);
	}
}
