package stringPrograms;

public class Occurance {

	public static void main(String[] args) {
		 String str = "My name is sushil";          
         str = str.toLowerCase().replace(" ", "");
         
         for(int i=0;i<str.length();i++) {       
        	 
        	 if(str.indexOf(str.charAt(i))==i) {       
        		 int count=0;                          
        		 
        	 for(int j=0;j<str.length();j++) {          
        		 
        		 if(str.charAt(i)==str.charAt(j)) {
        			 count++;              
        		 }
        		 
        	 }
        	 System.out.println(str.charAt(i)+" "+count);
        	 
         }

	}

}}
