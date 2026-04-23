package StreamPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,2,4,5,1,6,2,1);

		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		list.stream()
		    .filter(x -> !seen.add(x))
		    .filter(duplicates::add)
		    .forEach(System.out::println);
		
		
		// following code is more simple
		
		Set<Integer> seen1 = new HashSet<>();
		Set<Integer> duplicates1 = new LinkedHashSet<>();

		list.stream()
		    .filter(x -> !seen1.add(x))
		    .forEach(duplicates1::add);

		duplicates1.forEach(System.out::println);
	}

}
