package Array.java;

public class StringTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "H ello  Wo rld";
		char remove = 'w';
		str = str.replace(" ","").toLowerCase();
		String Result = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=remove) {
				Result = Result+ch;
			}
		}
		System.out.println(Result);
	}

}
