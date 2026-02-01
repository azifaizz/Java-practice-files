package Q100;

public class Q55 {
    public static void main(String[] args) {
        String[] cart = {"Apple","Banana","Apple","Orange","Banana"};

        for(int i = 0; i < cart.length; i++) {
            boolean unique = true;

            for(int j = 0; j < i; j++) {
                if(cart[i].equals(cart[j])) {
                    unique = false;
                    break;
                }
            }

            if(unique) {
                System.out.println(cart[i]);
            }
        }
    }
}
