package StreamPrograms;

import java.util.Arrays;
import java.util.List;

public class AdditionOfNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 5, 8, 2, 1);
		
		int sum = list.stream()
	              .reduce(0, Integer::sum);
		
	    System.out.println(sum);
	    
	    
	    //Addition of Even Numbers
	    
	    int evenSum = list.stream()
	              .filter(x -> x % 2 == 0)
	              .mapToInt(Integer::intValue)
	              .sum();

	System.out.println(evenSum);
	
	
	//Addition of Odd Numbers
	
	int oddSum = list.stream()
            .filter(x -> x % 2 != 0)
            .mapToInt(Integer::intValue)
            .sum();
	System.out.println(oddSum);
	
	
	}

}
