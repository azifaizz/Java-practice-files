package Array.java;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int key = sc.nextInt();

        int position = -1;
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found.");
        }
    }
}
