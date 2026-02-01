package wtt.aseel.java;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int spa = n; spa > i; spa--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int col = 0; col <= i; col++) {
                System.out.print(" "+num);
                num = num * (i - col) / (col + 1);
            }
            System.out.println();
        }
    }
}
