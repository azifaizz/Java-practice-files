package wtt.aseel.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Library_management {

    static class Book {
        int id;
        String name;
        boolean isIssued;
        Book(int id, String name) {
            this.id = id;
            this.name = name;
            this.isIssued = false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    boolean exists = false;
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).id == id) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Book ID already exists.");
                        break;
                    }
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    books.add(new Book(id, name));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        System.out.println("ID | Name | Status");
                        System.out.println("-------------------");

                        for (int i = 0; i < books.size(); i++) {
                            Book b = books.get(i);
                            System.out.print(b.id + " | " + b.name + " | ");
                            if (b.isIssued) {
                                System.out.println("Issued");
                            } else {
                                System.out.println("Available");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        if (b.id == searchId) {
                            System.out.println("ID: " + b.id);
                            System.out.println("Name: " + b.name);
                            System.out.print("Status: ");
                            if (b.isIssued) {
                                System.out.println("Issued");
                            } else {
                                System.out.println("Available");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    boolean issued = false;

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        if (b.id == issueId) {
                            if (b.isIssued) {
                                System.out.println("Book already issued.");
                            } else {
                                b.isIssued = true;
                                System.out.println("Book issued successfully.");
                            }
                            issued = true;
                            break;
                        }
                    }

                    if (!issued) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    boolean returned = false;

                    for (int i = 0; i < books.size(); i++) {
                        Book b = books.get(i);
                        if (b.id == returnId) {
                            if (!b.isIssued) {
                                System.out.println("Book was not issued.");
                            } else {
                                b.isIssued = false;
                                System.out.println("Book returned successfully.");
                            }
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting system.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
