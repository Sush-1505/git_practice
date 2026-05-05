package StreamPrograms;

import java.util.stream.Collectors;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		        String str = "programming";

		        String result = str.chars()                 // IntStream of chars
		                .distinct()                         // remove duplicates
		                .mapToObj(c -> String.valueOf((char) c))
		                .collect(Collectors.joining());

		        System.out.println(result);
		    
	}

}
