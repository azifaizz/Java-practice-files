package Collections;
import java.util.Deque;
import java.util.LinkedList;
public class DequeEg1 {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();
        dq.addFirst("eef");
        dq.addLast("is");
        dq.addLast("massdsl");
        System.out.println("Deque: " + dq);
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Contains 'java': " + dq.contains("java"));
        System.out.println("Last element: " + dq.peekLast());
        System.out.println("Removed first: " + dq.removeFirst());
        System.out.println("Removed last: " + dq.removeLast());
        System.out.println("Size: " + dq.size());
        System.out.println("Is deque empty? " + dq.isEmpty());
        System.out.println("Deque after remove: " + dq);
        System.out.println("END");
    }
}
