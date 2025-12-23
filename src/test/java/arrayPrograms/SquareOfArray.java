package arrayPrograms;

public class SquareOfArray {

	public static void main(String[] args) {

		int x[] = { 2, 3, 4, 5, 6 };

		int square = 0;
		
		for (int i = 0; i < x.length; i++) {

			square = x[i] * x[i];

			System.out.println(square);

		}
	}

}
