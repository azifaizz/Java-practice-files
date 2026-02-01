package Q100;

public class Q27 {
	static String getlong(String para) {
		String[] words = para.split(" ");
		String longest = "";
		for(int i = 0;i<words.length;i++) {
			if(words[i].length()>longest.length()) {
				longest = words[i];
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "dsds gth thththth tgrtr ererere";
		System.out.println(getlong(para));
		
	}

}
