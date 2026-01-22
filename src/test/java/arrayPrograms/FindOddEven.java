package arrayPrograms;

public class FindOddEven {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]/2*2==a[i]) {
				System.out.println("Even "+a[i]);
			}
			else {
				System.out.println("Odd "+a[i]);
			}
		}
	}

}
