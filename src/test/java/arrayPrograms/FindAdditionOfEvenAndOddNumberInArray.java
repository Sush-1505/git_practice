package arrayPrograms;

public class FindAdditionOfEvenAndOddNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int evensum = 0;
		int oddsum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evensum = evensum + a[i];
			} else {
				oddsum = oddsum + a[i];
			}
		}

		System.out.println("Even Number Sum Is " + evensum);
		System.out.println("Odd Number Sum Is " + oddsum);
	}
}
