package StreamPrograms;

import java.util.Arrays;

public class UniversalLargestString {

	public static void main(String[] args) {

		String s="My name is ababa";
		
		//following code is for descending sorting
		
		 String largest=Arrays.stream(s.split(" ")).
				 sorted((a,b)->Integer.compare(b.length(),a.length()))
				.skip(0).findFirst().orElse(" ");
		 
		// System.out.print(largest);
		 
		 //The above code is used to find any largest length of String means First,Second etc.
		 		 
		 String rev="";
		 
		 for(int i=largest.length()-1;i>=0;i--) {
			 
			 rev=rev+largest.charAt(i);
		 }
		 System.out.println(rev);
		 
		 if(rev.equals(largest)) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not Palindrome");
		 }
	}

}
