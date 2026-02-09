package collectionPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {

        String s = "tommorow";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
