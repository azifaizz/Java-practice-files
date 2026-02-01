package Q100;

import java.util.Scanner;

public class Q83 {
	static int totalseats = 40;
	static void seatcheck() {
		System.out.println("avail seats are:"+totalseats);
	}
	static void bookseat(int seats) {
		if(seats>totalseats) {
			totalseats = totalseats - seats;
			System.out.println("seat confirm");
		}else {
			System.out.println("No seats available");
		}
	}
	static void exit() {
		System.out.println("exiting");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("\n--- BUS RESERVATION MENU ---");
            System.out.println("1. View Available Seats");
            System.out.println("2. Book Seats");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice) {
            case 1:
            	seatcheck();
            	break;
            case 2:
            	System.out.println("Enter the number of seats:");
            	int seats = sc.nextInt();
            	bookseat(seats);
            	break;
            case 3:
            	exit();
            	break;
            }
		}while(choice!=3);

	}

}
