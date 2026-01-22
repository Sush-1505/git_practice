package arrayPrograms;

public class CommonElementAddFromTwoArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int b[]= {1,3,5,6};
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					sum=sum+a[i];
					System.out.println("Common Element "+a[i]);	
				}
			}
		}
		System.out.println("Sum of Common Element is "+sum);
	}
}
