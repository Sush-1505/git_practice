package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String S = "STAR";

		String rev = "";

		char a[] = S.toCharArray();
		int x = a.length;
		
		for(int i=x-1; i>=0; i--) {
			
			rev = rev + a[i];
			
		}
		System.out.println("Original string = "+S);
		System.out.println();
		System.out.println("Reverse  string = "+ rev);
	}
}