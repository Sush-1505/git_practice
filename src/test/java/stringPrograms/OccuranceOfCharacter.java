package stringPrograms;

public class OccuranceOfCharacter {


		    public static void main(String[] args) {

		    	 String str = "My name is Sushil";

		         // Optional: make case-insensitive & remove spaces
		         str = str.toLowerCase().replace(" ", "");

		         int[] freq = new int[256]; 

		         // Count character frequency
		         for (int i = 0; i < str.length(); i++) {
		             freq[str.charAt(i)]++;
		             
		         }

		         // Print occurrences
		         for (int i = 0; i < str.length(); i++) {    
		             char ch = str.charAt(i);     

		             if (freq[ch] != 0) {
		                 System.out.println(ch + " -> " + freq[ch]);    
		                 freq[ch] = 0; // avoid duplicate printing
		             }
		         }		    }
		}

	


