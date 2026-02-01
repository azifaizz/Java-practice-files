package Algo.java;

public class TAsk4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 21, 30, 41, 50};
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);

	}

}
