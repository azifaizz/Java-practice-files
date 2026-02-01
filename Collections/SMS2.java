package Collections;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class SMS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Mclass> students = new LinkedList<Mclass>();
        int choice;
        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add student");
            System.out.println("2. Remove student (front)");
            System.out.println("3. Show students");
            System.out.println("0. Exit");
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
                if (students.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    Mclass s = students.remove();
                    System.out.println("Removed student:");
                    s.display();
                }
            }
            else if (choice == 3) {
                if (students.isEmpty()) {
                    System.out.println("No students found");
                } else {
                    System.out.println("ID | NAME | MARKS");
                    for (Mclass s : students) {
                        s.display();
                    }
                }

            } 
            else if (choice == 0) {
                System.out.println("Program ended");
            } 
            else {
                System.out.println("Wrong choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

