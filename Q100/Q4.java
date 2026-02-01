package Q100;

public class Q4 {

    static String mask(String mobile) {
        String result = "";

        for (int i = 0; i < mobile.length(); i++) {
            if (i < mobile.length() - 4)
                result += "*";
            else
                result += mobile.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mask("9786890102"));
    }
}
