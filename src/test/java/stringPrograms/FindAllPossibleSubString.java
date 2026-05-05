package stringPrograms;

public class FindAllPossibleSubString {

	public static void main(String[] args) {

		String str="abcdabcb";      //a ab abc b bc c
			
		String n="";
		
		for(int i=0;i<str.length();i++) {
				
			for(int j=i+1;j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
				 n=str.substring(i, j);
				System.out.println(n);	
			}
			}
		}
	}

}
