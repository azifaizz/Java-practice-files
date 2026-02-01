package Collections;

import java.util.*;

public class QQ11 {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Apple");
        set1.add("Orange");

        System.out.println("HashSet with duplicates added:");
        System.out.println(set1);
        HashSet<Object> mixedSet = new HashSet<>();
        mixedSet.add(10);
        mixedSet.add("Hello");
        mixedSet.add(20);
        mixedSet.add("World");

        System.out.println("\nHashSet with Integer and String:");
        System.out.println(mixedSet);

        ArrayList<Object> list = new ArrayList<>(mixedSet);

        System.out.println("\nConverted ArrayList:");
        System.out.println(list);

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);
        setB.add(4);

        HashSet<Integer> commonSet = new HashSet<>(setA);
        commonSet.retainAll(setB);

        System.out.println("\nCommon elements:");
        System.out.println(commonSet);

        System.out.println("\nTotal elements in setA: " + setA.size());
    }
}
