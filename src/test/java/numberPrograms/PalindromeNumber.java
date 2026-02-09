package numberPrograms;


public class PalindromeNumber {

	public static void main(String[] args) {

		  int a=121;
	      int org=a;
	      int rev=0;

	         while(a>0){
	        	 
	             rev=rev*10+a%10;  //10+2=121
	             a=a/10;    //1
	         }
	         
	        System.out.println(rev);
	         if(org==rev){
	             System.out.println("Palindrome");
	         }
	         else{
	             System.out.println("Not Palindrome");
	         }
	}

}
