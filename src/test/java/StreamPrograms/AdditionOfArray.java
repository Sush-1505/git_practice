package StreamPrograms;

import java.util.Arrays;
public class AdditionOfArray {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5};
		
		int sum=Arrays.stream(a).sum();
		System.out.println(sum);
		
		System.out.println(Arrays.stream(a).count());
	}

}
