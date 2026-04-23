package StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 5, 8, 20, 15);
		
		Optional<Integer> secondLargest =
			    list.stream()
			        .distinct()                 // remove duplicates
			        .sorted(Comparator.reverseOrder())
			        .skip(1)                   // skip largest
			        .findFirst();

			System.out.println(secondLargest.get());
			
			Optional<Integer> secondMin =
				    list.stream()
				        .distinct()                 // remove duplicates
				        .sorted(Comparator.naturalOrder())
				        .skip(1)                   // skip largest
				        .findFirst();

				System.out.println(secondMin.get());
	}

}
