package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queueeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new LinkedList<String>();
		q.add("asee");
		q.add("iss");
		q.add("adff");
		System.out.println(q.poll());
		System.out.println("Size: " + q.size());
		System.out.println("Front element: " + q.peek());
		System.out.println("Removed element: " + q.remove());
		System.out.println("Is queue empty? " + q.isEmpty());
		System.out.println("Queue after remove: " + q);
		Queue<String> q1 = new LinkedList<String>();
        q1.add("test");
        q1.addAll(q);
        System.out.println("Second queue: " + q1);
	}
}
