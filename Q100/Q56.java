package Q100;

public class Q56 {
    public static void main(String[] args) {
        int[] inventory = {10,20,30,40,50};
        int key = 30;
        int low = 0, high = inventory.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(inventory[mid] == key) {
                System.out.println("Item found at index " + mid);
                return;
            } else if(inventory[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Item not found");
    }
}
