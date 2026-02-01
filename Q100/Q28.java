public class Q28 {

    static void findDuplicates(String password) {

        System.out.print("Duplicate characters: ");

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (password.charAt(j) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }
            int count = 0;
            for (int k = 0; k < password.length(); k++) {
                if (password.charAt(k) == ch) {
                    count++;
                }
            }

            if (count > 1 && !alreadyPrinted) {
                System.out.print(ch + " ");
            }
        }
    }

    public static void main(String[] args) {
        findDuplicates("passWord123p");
    }
}
