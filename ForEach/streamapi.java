package ForEach;
import java.util.*;

public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n = new ArrayList<>();
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.stream()
		.distinct()
		.map(num->num*2)
		.filter(num -> num %2 ==0)
		.sorted()
		.limit(4)
		.forEach(System.out::println);
	}

}
