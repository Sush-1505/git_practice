package collectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist_pr {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,1,2,3,1,2,3,1,2,3};
		//Arrays.sort(a);
		ArrayList<Integer> al=new ArrayList();
		
		for(int i=0;i<a.length;i++) {
		
			al.add(a[i]);
		
		}
		
		Collections.sort(al);
		//System.out.println(al);
		
		int c=al.get(1)+al.get(2);
//		for(int j=0;j<al.size();j++) {
//			for(int k=j+1;k<al.size();k++) {
//				if(al.get(j)==al.get(k)) {
//					System.out.println("Duplicate Number is "+al.get(j));
//				}
//			}}
		
		for(int i=0;i<al.size()-1;i++) {
			if(al.get(i)==al.get(i+1)) {
				System.out.println(al.get(i));
				
				while(i<al.size()-1 && al.get(i)==al.get(i+1)) {
					i++;
				}
			}
		}
		
		
	}

}
