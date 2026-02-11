package wtt.aseel.java;
import java.util.Scanner;
public class Armstrng {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int og = num;
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = result + (digit * digit * digit);
            num /= 10;
        }
        if (result == og) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not ArmstronNg");
        }
    }
}
