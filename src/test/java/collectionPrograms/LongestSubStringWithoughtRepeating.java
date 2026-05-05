package collectionPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoughtRepeating {

	public static void main(String[] args) {

		 String str = "abcabcbb";
	        System.out.println(longestSubstring(str));
	}
	
	public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int j = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }

}
