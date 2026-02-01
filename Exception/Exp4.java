package Exception;

import java.util.Scanner;

public class Exp4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 2000;
        int correctPin = 1234;

        try {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin != correctPin) {
                System.out.println("Invalid PIN");
                return;
            }

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            if (amount <= 0) {
                System.out.println("Invalid amount");
            } else if (amount > balance) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
                System.out.println("Amount debited: " + amount);
                System.out.println("Remaining balance: " + balance);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}
