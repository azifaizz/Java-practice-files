package Collections;
import java.util.*;
public class QQ2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(230);
		list.add(239);
		list.add(238);
		list.add(236);
		list.add(234);
        Collections.sort(list);
        System.out.println("Ascending: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
	}

}
