package Q100;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // rows

        int num = 2;

        for (int i = 1; i <= n; i++) {

            // left spacing
            for (int s = 0; s < n - i; s++) {
                System.out.print("      "); // 6 spaces
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.printf("%6d", num);
                num += 2;
            }

            System.out.println();
        }
    }
}
