package Ploymorphism;
import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        String correctUser = "admin";
        String correctPass = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        if(user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid username or password!");
        }
        sc.close();
    }
}

