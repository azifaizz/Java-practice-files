package wtt.aseel.java;

import java.util.Scanner;

public class SimpleLogin {

    public static void main(String[] args) {
        String username = "Azi";
        String password = "12345";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful! Welcome, " + username + "!");
        } else {
            System.out.println("Login Failed! Invalid username or password.");
        }

        sc.close();
    }
}
