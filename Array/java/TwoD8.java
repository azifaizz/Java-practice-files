package Array.java;

public class TwoD8 {
		public static void main(String[] args) {
	        int[][] A = {{2,5,1},{9,4,7},{3,6,8}};
	        int max = A[0][0];

	        for (int i = 0; i < A.length; i++) {
	            for (int j = 0; j < A[i].length; j++) {
	                if (A[i][j] > max) {
	                    max = A[i][j];
	                }
	            }
	        }

	        System.out.println("Max = " + max);

	}

}
