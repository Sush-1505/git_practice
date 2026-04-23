package StreamPrograms;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {

	public static void main(String[] args) {

		List <Integer> al=  Arrays.asList(1,2,6,4,6);
		
		//Maximum Number
		int max=al.stream().max((a,c)->a.compareTo(c)).get();
		System.out.println(max);
		
		//Minimum Number
		
		int min=al.stream().min((a,c)->a.compareTo(c)).get();
		System.out.println(min);
		
		//Count element
		System.out.println(al.stream().count());
		
	}
}
