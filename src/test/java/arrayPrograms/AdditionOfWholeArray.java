package arrayPrograms;

public class AdditionOfWholeArray {

	public static void main(String[] args) {

		int x[] = { 2, 2, 4, 6, 8, 2, 5 };

		// 2+2=4+4=8+6=14+8=22+2=24+5=29

		int product = 1;

		for (int i = 0; i < x.length; i++) {
       
			product=product*x[i];
		}

		System.out.println("Product Of Whole Array= " + product);
	}

}
