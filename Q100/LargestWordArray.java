package Q100;
public class LargestWordArray {
    public static void main(String[] args) {
        String[] words = {"Aseel","Ashfaq","Mohamed","Abdul"};
        String largestWord = "";
        for (int i=0;i<words.length;i++) {
            if (words[i].length()>largestWord.length()) {
                largestWord = words[i];
            }
        }
        System.out.println("Largest word: " + largestWord);
    }
}
