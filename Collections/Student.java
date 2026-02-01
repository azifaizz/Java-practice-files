package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<String>();
        str.add("Baw");
        str.add("Div");
        str.add("Hari");

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Search");
            System.out.println("4. View");
            System.out.println("5. Exit");
            System.out.print("Enter option: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Enter how many members to add: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter name " + (i + 1) + ": ");
                        String s = sc.nextLine();
                        str.add(s);
                    }
                    break;
                case 2:
                    System.out.print("Enter the name to remove: ");
                    String a = sc.nextLine();

                    if (str.remove(a)) {
                        System.out.println("Removed successfully");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter the name to search: ");
                    String b = sc.nextLine();

                    if (str.contains(b)) {
                        System.out.println("Element found");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 4:
                    System.out.println(str);
                    break;

                case 5:
                    System.out.println("Program exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Enter correct option");
            }

        } while (true);
    }
}
