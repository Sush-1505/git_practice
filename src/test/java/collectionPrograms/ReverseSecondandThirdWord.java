package collectionPrograms;

import java.util.ArrayList;

public class ReverseSecondandThirdWord {

	public static void main(String[] args) {

		String a="Java is programming language";
		
		String s[]=a.split(" ");
		
		ArrayList<String> arr=new ArrayList<String>();
		
		for(int i=0;i<s.length;i++) {
			arr.add(s[i]);
		}
		
		for(int i=1;i<arr.size()-1;i++) {
			String word=arr.get(i);  
			String rev="";
			
			for(int j=word.length()-1;j>=0;j--) {
				rev=rev+word.charAt(j);
			}
			
			arr.set(i, rev);  
		}
		
		 for(String str : arr){
	            System.out.print(str + " ");
	        }
}}
