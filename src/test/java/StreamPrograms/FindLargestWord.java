package StreamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLargestWord {

	public static void main(String[] args) {
		String input = "JAVA is Programming language";

		String largest = Arrays.stream(input.split(" "))
				.max((a, b) -> Integer.compare(a.length(), b.length()))
				.orElse(" ");
		System.out.println(largest);
	}
}