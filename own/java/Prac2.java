package own.java;
public class Prac2 {
    public static void main(String[] args) {
        int n = 4;
        int start = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = start - 1; j >= i; j--) {
                System.out.print(j);
            }
            start -= 2;
            System.out.println();
        }
    }
}
