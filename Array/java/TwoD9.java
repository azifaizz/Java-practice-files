package Array.java;

public class TwoD9 {
    public static void main(String[] args) {
        int A[][] = {{5,6,7},{8,9,1},{2,3,4}};
        int B[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int C[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Subtraction:");
        for (int[] r : C) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }
}
