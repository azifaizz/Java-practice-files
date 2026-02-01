package Q100;

public class Q22 {
	static int paragraph(String paragraph,String word) {
		int count = 0;
		String[] words = paragraph.split(" ");
		for(int i = 0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase(word)) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para = "java is easy and java is powerful";
        String word = "java";

        System.out.println("Count = " + paragraph(para, word));

	}

}
