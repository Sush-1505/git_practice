package collectionPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s="sushil";
		String result="";
		LinkedHashSet<Character> hs=new LinkedHashSet<>();
		
		 for(int i=0;i<s.length();i++){
		       char ch = s.charAt(i);
			 if(!hs.contains(ch)) {
		       hs.add(ch);
			 result = result + ch;
		   }
		 
		 String result1 = "";
	        for (char ch1 : hs) {
	            result1 = result1 + ch1;
	        }

	//        System.out.println(result1);
	}
		   System.out.println(result);
		
	}

}
