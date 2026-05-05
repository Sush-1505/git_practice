package StreamPrograms;

import java.util.Arrays;

public class FindOddEven {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Even Numbers Are ");
		
		Arrays.stream(a).filter(x->x%2==0).forEach(System.out::print);
		
		System.out.println();
		
		System.out.println("Odd Numbers Are ");
		
		Arrays.stream(a).filter(y->y%2!=0).forEach(System.out::print);
	}

}
