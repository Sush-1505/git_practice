package StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenNumber {

	public static void main(String[] args) {

//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//
//		list.stream()
//		
//		    .filter(x -> x % 2 == 0)
//		    .forEach(System.out::println);
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);

		Map<Boolean, List<Integer>> result =
		    list1.stream()
		        .collect(Collectors.partitioningBy(x -> x % 2 == 0));

		System.out.println("Even Numbers: " + result.get(true));
		System.out.println("Odd Numbers: " + result.get(false));
	}

	
	
}
