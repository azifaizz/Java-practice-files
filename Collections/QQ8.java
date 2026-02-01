package Collections;

import java.util.*;

public class QQ8 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("C");
        list.addFirst("Start");
        list.add(2, "Middle");
        list.addLast("End");
        System.out.println(list);
    }
}

