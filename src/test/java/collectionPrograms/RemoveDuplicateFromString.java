package collectionPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s="sushil";
		
		LinkedHashSet hs=new LinkedHashSet();
		
		 for(int i=0;i<s.length();i++){
		       
		       hs.add(s.charAt(i));
		   }
		   System.out.print(hs);
		
	}

}
