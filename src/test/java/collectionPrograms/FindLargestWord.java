package collectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindLargestWord {

	public static void main(String[] args) {

		String str = "My name is Aruna";
		String[] S = str.split(" ");
		String max = "";
		int maxlength = 0;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String a : S) {
			map.put(a, a.length());

			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() > maxlength) {
					maxlength = entry.getValue();
					max = entry.getKey();

				}
			}
		}
		System.out.println(" " + max);
    } 

 }
