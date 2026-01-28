package stringPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {

		 String s = "sushil";
		 String result = "";

		 for (int i = 0; i<s.length(); i++) {
		    int j;
		     for ( j = 0; j<i; j++) {
		         if (s.charAt(i) == s.charAt(j)) {
		             break;
		         }
		     }
		     if (j == i) {
		         result += s.charAt(i);
		     }
		 }

		 System.out.println(result);
	}
}
