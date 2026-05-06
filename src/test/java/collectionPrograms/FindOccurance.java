package collectionPrograms;


import java.util.LinkedHashMap;

public class FindOccurance {

	public static void main(String[] args) {

		String s="java";
		
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			map.compute(ch,(k,v)->(v==null)?1:++v);
			
			}
		System.out.println(map);
	}

}
