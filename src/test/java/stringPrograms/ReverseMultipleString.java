package stringPrograms;

public class ReverseMultipleString {

	public static void main(String[] args) {

		String s="Aruna Parre";
		
		String[]q=s.split(" ");
		
		String w=q[1];
		
		System.out.println("Original String is: "+w);
		
		String rev="";
   
		for(int i=w.length()-1;i>=0;i--) {
			rev=rev+w.charAt(i);
		}

		System.out.println("Reverse String is:  "+rev);
	
	}
	}