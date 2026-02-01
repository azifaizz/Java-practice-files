package Collections;

import java.util.*;

public class QQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Azi");
        list1.add("Rahul");
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("Aziii");
        list1.add("Rahulww");
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
	}

}
