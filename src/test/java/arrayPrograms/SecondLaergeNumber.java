package arrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class SecondLaergeNumber {

	public static void main(String[] args) {

		int a[]= {1,2,9,3,4,5,6,7,8,55,78,78,78};
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	//	System.out.println(a[a.length-2]);
		LinkedHashSet hs=new LinkedHashSet<>();     
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}

		ArrayList al=new ArrayList(hs);
		System.out.println(al.get(al.size()-2));
				
		
}}
