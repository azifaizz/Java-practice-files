package wtt.aseel.java;

import java.util.Scanner;

public class ATM {

    private int pin;
    private double balance;
    Scanner sc = new Scanner(System.in);

    // Constructor
    public ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    // Function to add money
    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
            System.out.println("New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Function to withdraw money
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Function to check balance
    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    // Function to display the main menu
    void menu() {
        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: deposit(); break;
                case 2: withdraw(); break;
                case 3: checkBalance(); break;
                case 4: System.out.println("Thank you for using AZI Bank."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }

    // Main method
    public static void main(String[] args) {
        ATM atm = new ATM(2002, 2500.0);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == atm.pin) {
            atm.menu();
        } else {
            System.out.println("Incorrect PIN!");
        }

        sc.close();
    }
}
