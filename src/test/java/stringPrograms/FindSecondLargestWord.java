package stringPrograms;

import java.util.ArrayList;

public class FindSecondLargestWord {

	public static void main(String[] args) {

		String a="My name is Aruna";
		
		String []b=a.split(" ");
		
		String temp=" ";
		
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length;j++) {
				
				if(b[i].length()>b[j].length()) {
					
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(String w:b) {
			al.add(w);
		//	System.out.println(w);
		}
		
		//System.out.println(b[b.length-2]);	
		
		System.out.println(al.get(al.size()-2));
	}
}
