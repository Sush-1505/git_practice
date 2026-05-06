package StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestReverse {

	public static void main(String[] args) {
		  String str = "My name is Aruna";

		  List<String> words = Arrays.asList(str.split(" "));
		  String secondLargest = words.stream()
			        .sorted(Comparator.comparingInt(String::length).reversed()) 
			        .skip(1)
			        .findFirst()
			        .orElse("Not found");	
		  System.out.println("Second largest word: " + secondLargest);
		  
	/*	  StringBuilder rev = new StringBuilder();
		  for (int i = secondLargest.length() - 1; i >= 0; i--) {
		      rev.append(secondLargest.charAt(i));
		  }
		  System.out.println(rev.toString()); */
		  String original = secondLargest;
		  String rev="";
		  for(int i=secondLargest.length()-1 ; i>=0; i--) {
			  rev= rev+secondLargest.charAt(i);
			  
			  
		  }
		  System.out.println("Reverse word : "+rev); 
	}
	      

	}


