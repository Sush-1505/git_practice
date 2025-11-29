package stringPrograms;

public class anagarm {

	public static void main(String[] args) {
	
		String a="tone";          
		String b="note";
		String newString="";
		
		if(a.length()==b.length()) {
			
		for(int i=0;i<a.length();i++) {          
			char c=a.charAt(i);
			for(int j=0;j<b.length();j++) {
				if(c==b.charAt(j)) {	
					newString=newString+b.charAt(j);
				}
			}		
		}
		System.out.println(newString);
		
		if(a.equals(newString)) {
			
			System.out.println("is anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
		else {
			System.out.println("Not Anagram");
		}
	}
}
