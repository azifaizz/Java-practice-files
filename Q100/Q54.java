package Q100;

import java.util.*;

public class Q54 {
    public static void main(String[] args) {
        int[] rolls = {101, 102, 103, 101, 104, 102};

        System.out.println("Duplicate roll numbers:");

        for (int i = 0; i < rolls.length; i++) {
            for (int j = i + 1; j < rolls.length; j++) {
                if (rolls[i] == rolls[j]) {
                    System.out.println(rolls[i]);
                    break;
                }
            }
        }
    }
}
