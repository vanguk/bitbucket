package task02;

import java.util.HashMap;
import java.util.Map;

public class MyClass {
    public static Map<Integer, Integer> someMethod(int[] input, int k) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            if (result.containsKey(input[i]))
                System.out.println(input[i] + ", " + result.get(input[i]));
            else
                result.put(k - input[i], input[i]);
        }
        return result;
    }
}
