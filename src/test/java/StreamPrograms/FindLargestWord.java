package StreamPrograms;

import java.util.Arrays;

public class FindLargestWord {

	public static void main(String[] args) {
		String input = "JAVA is Programming language";

		String largest = Arrays.stream(input.split(" "))
				.max((a, b) -> Integer.compare(a.length(), b.length()))
				.orElse(" ");
		System.out.println(largest);
		
		
		//Second largest element
		
		String secondLargest = Arrays.stream(input.split(" "))
		        .sorted((a, b) -> Integer.compare(b.length(), a.length()))
		        .skip(1)
		        .findFirst()
		        .orElse(" ");

		System.out.println(secondLargest);	}
}