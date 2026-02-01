package ForEach;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Streamapi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n = new ArrayList<>();
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(63);
		n.add(64);
		n.add(65);
		n.add(66);
		n.add(67);
		n.stream()
		.filter(num -> num %2 ==0)
		.collect(Collectors.toList())
		.forEach(System.out::println);

	}

}
