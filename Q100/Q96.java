package Q100;
import java.util.Scanner;

public class Q96 {

    static Contact[] contacts = new Contact[5];
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addContact(sc);
            } else if (choice == 2) {
                viewContacts();
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    static void addContact(Scanner sc) {

        if (count == contacts.length) {
            System.out.println("Contact list full");
            return;
        }

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        contacts[count] = new Contact(name, phone);
        count++;

        System.out.println("Contact added");
    }

    static void viewContacts() {

        if (count == 0) {
            System.out.println("No contacts available");
            return;
        }

        for (int i = 0; i < count; i++) {
            contacts[i].display();
        }
    }
}
