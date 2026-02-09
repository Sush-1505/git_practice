package collectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AnagramByArrayList {

	public static void main(String[] args) {

		String s="tone";
		String a="note";
		
		ArrayList al=new ArrayList();
				
		ArrayList bl=new ArrayList();
		
		for(int i=0;i<s.length();i++) {
			al.add(s.charAt(i));
		}
		
		for(int i=0;i<a.length();i++) {
			bl.add(a.charAt(i));
		}
		
		Collections.sort(al);
				
		Collections.sort(bl);
		
		if(al.equals(bl)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("String is not anagram");
		}
	
	}

}
