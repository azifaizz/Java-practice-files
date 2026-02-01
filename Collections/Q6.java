package Collections;

import java.util.Arrays;
import java.util.*;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 5, 30, 2, 50);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

	}

}
