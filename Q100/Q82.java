package Q100;

import java.util.Scanner;

public class Q82 {
	static int balance = 10000;
	static void withdraw(int amount) {
		if(amount<balance) {
			balance = balance - amount;
		}else {
			System.out.println("innsufff balance");
		}
	}
	static void chckbalance() {
		System.out.println("balance is"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 
		 Scanner sc = new Scanner(System.in);
		 int choice;
		 do {
			 System.out.println("\n--- ATM MENU ---");
	            System.out.println("1. Withdraw");
	            System.out.println("2. Check Balance");
	            System.out.println("3. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            switch(choice) {
	            case 1:
	            	System.out.println("Enter the amount:");
	            	int amount = sc.nextInt();
	            	withdraw(amount);
	            	break;
	            case 2:
	            	chckbalance();
	            	break;
	            case 3:
	            	System.out.println("exiting");
	            	break;
		 }
	}while(choice!=3);
	}

}
