package Collections;
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> uniqueList = new ArrayList<>(new HashSet<>(list));
        System.out.println(uniqueList);

	}

}
