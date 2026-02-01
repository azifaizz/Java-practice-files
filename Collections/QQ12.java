package Collections;

import java.util.*;

public class QQ12 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(50);

        System.out.println("Sorted TreeSet:");
        System.out.println(set);
        set.remove(30);
        System.out.println("\nAfter removing 30:");
        System.out.println(set);
        System.out.println("\nLowest value: " + set.first());
        System.out.println("Highest value: " + set.last());
        int searchValue = 20;
        if (set.contains(searchValue)) {
            System.out.println("\n" + searchValue + " exists in the TreeSet");
        } else {
            System.out.println("\n" + searchValue + " does not exist in the TreeSet");
        }
    }
}

