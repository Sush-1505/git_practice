package collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramByAruna {

	public static void main(String[] args) {

		String []a= {"ate","net","tea","ten","eat","bat"};
		
		//{{ate,tea,eat},{net,ten},{bat}}
		
		 HashMap<String, ArrayList<String>> map = new HashMap<>();

	        for(String word : a) {

	            char[] ch = word.toCharArray();
	            Arrays.sort(ch);                 // sort characters
	            String key = new String(ch);     // use as key

	            if(!map.containsKey(key)) {
	                map.put(key, new ArrayList<>());
	            }

	            map.get(key).add(word);
	        }

	        System.out.println(map.values());
	}

}
