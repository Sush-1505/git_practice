package stringPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String S = "NOTE";
		String T = "TONE";

		char A[] = S.toCharArray();
		char B[] = T.toCharArray();

		Arrays.sort(A);
		System.out.println(A);
		Arrays.sort(B);
		System.out.println(B);

		if (Arrays.equals(A, B)) {
			
			System.out.println("String is anagram");

		} else {
			
			System.out.println("String is not anagram");
		}

	}
}
