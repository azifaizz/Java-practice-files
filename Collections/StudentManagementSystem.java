package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Mclass> students = new ArrayList<Mclass>();

        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Show All Students");
            System.out.println("0 Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                Mclass s = new Mclass(id, name, marks);
                students.add(s);

                System.out.println("Student added");

            } 
            else if (choice == 2) {

                System.out.print("Enter id to remove: ");
                int rid = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == rid) {
                        students.remove(i);
                        found = true;
                        System.out.println("Student removed");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found");
                }

            } 
            else if (choice == 3) {

                if (students.size() == 0) {
                    System.out.println("No students available");
                } else {
                    System.out.println("ID | NAME | MARKS");
                    for (int i = 0; i < students.size(); i++) {
                        students.get(i).display();
                    }
                }

            } 
            else if (choice == 0) {
                System.out.println("Program ended");
            } 
            else {
                System.out.println("Invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
