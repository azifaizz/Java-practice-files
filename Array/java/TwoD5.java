package Array.java;
public class TwoD5 {

    public static void main(String[] args) {

        int A[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
        int B[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int RowA = A.length;
        int ColA = A[0].length;
        int RowB = B.length;
        int ColB = B[0].length;

        int[][] c = new int[RowA][ColB];

        for(int i = 0; i < RowA; i++) {
            for(int j = 0; j < ColB; j++) {
                c[i][j] = 0;
                for(int k = 0; k < ColA; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // print the result
        for(int i = 0; i < RowA; i++) {
            for(int j = 0; j < ColB; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
