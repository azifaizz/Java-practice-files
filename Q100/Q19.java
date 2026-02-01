public class Q19 {

    static int calculateBill(int units) {
        int bill = 0;

        if (units <= 100) {
            bill = units * 1;
        } 
        else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
        } 
        else {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        }

        return bill;
    }

    public static void main(String[] args) {
       calculateBill(250);
    }
}
