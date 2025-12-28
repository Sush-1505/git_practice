package arrayPrograms;

public class AdditionOfWholeArray {

	public static void main(String[] args) {

		int x[] = { 2, 2, 4, 6, 8, 2, 5 };


		int sum = 1;
		int sum1 = 0;

		for (int i = 0; i < x.length; i++) {
       
			sum1=sum1*x[i];
		}

		System.out.println("addition Of Whole Array= " + sum1);
	}

}
