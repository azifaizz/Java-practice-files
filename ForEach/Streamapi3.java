package ForEach;
import java.util.ArrayList;
import java.util.Optional;
public class Streamapi3 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(63);
        n.add(64);
        n.add(65);
        n.add(66);
        n.add(67);
        long count =
            n.stream()
             .filter(num -> num % 2 == 0)
             .count();
        int sum =
            n.stream()
             .filter(num -> num % 2 == 0)
             .reduce(0, Integer::sum);
        Optional<Integer> firstEven =
            n.stream()
             .filter(num -> num % 2 == 0)
             .findFirst();
        System.out.println("Count : " + count);
        System.out.println("Sum   : " + sum);
        System.out.println("First : " + firstEven.get());
    }
}
