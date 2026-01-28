package stringPrograms;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String S= "POP";
				
		String rev= "";
		
		char a[]=S.toCharArray();
		int x= a.length;
		
		for (int i=x-1; i>=0; i--) {
			 
			rev= rev+a[i];
		}
		System.out.println(rev);
		if (S.equalsIgnoreCase(rev))
		System.out.println("Given String is Palindrome");
		else 
			System.out.println("Given String is Not Palindrome");
		
		}
			
	}


