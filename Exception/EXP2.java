package Exception;
import java.util.Scanner;
public class EXP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();
        try {
            if (!user.equals("azi") || !pass.equals("azi")) {
                System.out.println("Invalid login");
            } else {
                System.out.println("Login successful");
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
