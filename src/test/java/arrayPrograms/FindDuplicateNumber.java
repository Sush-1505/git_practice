package arrayPrograms;

import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int x[] = { 2, 2, 2, 4, 5, 6, 9, 8, 6, 7 };

		int temp=0;
	//	Arrays.sort(x);
//		System.out.println(" " + Arrays.toString(x));
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}

		for (int i = 0; i < x.length-1; i++) {

				if (x[i] == x[i+1]) {
					
                System.out.println("Duplicate Numbers are: " + x[i]);
                // Skip all repeated values
                while (i < x.length - 1 && x[i] == x[i + 1]) {
                    i++;
				} 
			}
		}
	}
}

