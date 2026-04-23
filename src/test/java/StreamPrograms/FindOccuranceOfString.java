package StreamPrograms;

import java.util.LinkedHashMap;

public class FindOccuranceOfString {

	public static void main(String[] args) {

		String a="java$java&";
		
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			map.compute(ch, (k,v)->(v==null)?1:++v);
			
		}
		
		System.out.println(map);
	}

}
