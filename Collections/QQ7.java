package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class QQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Aseel");
		list.add("Aseela");
		list.add("Aaqila");
		list.addFirst("R");
		list.addLast("Banu");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
