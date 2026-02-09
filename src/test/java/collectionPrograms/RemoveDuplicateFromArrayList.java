package collectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(10);
		
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>(al);
		System.out.println(hs);
		
	}

}
