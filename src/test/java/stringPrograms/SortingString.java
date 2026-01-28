package stringPrograms;

  public class SortingString {

	public static void main(String[] args) {

		String str = "java";

		char[] x = str.toCharArray();
		char temp;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;

				}
			}
		}

		System.out.println(x);
	}

}
