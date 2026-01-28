package collectionPrograms;

import java.util.HashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s="sushil";
		
		HashSet hs=new HashSet();
		
		 for(int i=0;i<s.length();i++){
		       
		       hs.add(s.charAt(i));
		   }
		   System.out.print(hs);
		
	}

}
