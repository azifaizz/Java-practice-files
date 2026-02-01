package Array.java;

public class TwoD10 {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Multiplication:");
        for (int[] r : C) {
            for (int x : r) System.out.print(x + " ");
            System.out.println();
        }
    }
}
