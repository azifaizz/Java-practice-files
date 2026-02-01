package wtt.aseel.java;

public class PalPrime {
    public static void main(String[] args) {
        int num = 151;
        int temp = num;
        int rev = 0;

        // Reverse the number
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        // Check if palindrome
        if (num == rev) {
            int count = 0;
            // Check if prime
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num + " is PalPrime");
            } else {
                System.out.println(num + " is Palindrome but not Prime");
            }
        } else {
            System.out.println(num + " is not Palindrome");
        }
    }
}
