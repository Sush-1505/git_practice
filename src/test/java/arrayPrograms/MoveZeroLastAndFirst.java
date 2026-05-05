package arrayPrograms;

public class MoveZeroLastAndFirst {

	public static void main(String[] args) {

		int a[]= {1,0,8,0,6,0,0,4};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				int temp=0;
				
				if(a[i]==0) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			}
		}
	}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]);
		}

		System.out.println();
		
		int x[] = { 1, 0, 8, 0, 6, 0, 0, 4 };

		for (int i = x.length-1; i >=0; i--) {

			for (int j =i; j>=0; j--) {

				int temp = 0;

				if (x[i] == 0) {

					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}

		for (int i = 0; i < x.length; i++) {

			System.out.print(x[i]);
		}

	}
}
