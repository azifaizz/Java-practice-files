package Algo.java;

public class TaskC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 17;   // change the number
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
		

	}

}
