package task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IgnoreDuplicateMas {

    private IgnoreDuplicateMas() {
    }

    public static HashMap<Integer, Integer> slowDuplicateSortedMethod(int... mas) {
        HashSet<Integer> unique = new HashSet<>();
        HashMap<Integer, Integer> duplicate = new HashMap<>();
        int count = 1;
        for (int item : mas) {
            if (unique.contains(item)) {
                if (!duplicate.containsKey(item)) {
                    duplicate.put(item, ++count);
                    count = 1;
                } else {
                    duplicate.put(item, duplicate.get(item) + 1);
                }
            } else {
                unique.add(item);
            }
        }
        return duplicate;
    }

    public static void printDuplicateNumber(HashMap<Integer, Integer> mas) {
        for (Map.Entry item : mas.entrySet()) {
            System.out.println("Число " + item.getKey() + " повторяется " + item.getValue() + " раза");
        }
    }
}