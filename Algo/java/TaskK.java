package Algo.java;

public class TaskK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 16, 18, 25, 26, 49};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (x >= 0) {
                int s = (int) Math.sqrt(x);
                if (s * s == x) {
                    count++;
                }
            }
        }

        System.out.println("Perfect squares count: " + count);
    }
}
