package other;

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class App1 {
    public static void main(String[] args) {
        String s = "aaaabbbcd";

        Map<String, Integer> result = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            String current = valueOf(s.charAt(index));
            Integer counter = result.get(current);
            if (counter == null) {
                counter = 0;
            }
            result.put(current, ++counter);
        }

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.print(entry.getValue() + entry.getKey());
        }
        System.out.println();
        Integer i = 0;
        ClassLoader classLoader = i.getClass().getClassLoader();
        System.out.println(classLoader);
    }
}
