package tryyyy;

public class additionofarray {

	public static void main(String[] args) {

		int a[]= {1,5,8,9,4,0};
		
		int evensum=0;
		int oddsum=0;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				evensum=evensum+a[i];
				count++;
			}
			
			else {
				oddsum=oddsum+a[i];
			}
		}
		
		System.out.println("Even number sum is "+evensum);
		
		System.out.println("Odd number sum is "+oddsum);
		System.out.println(count);
	}

}
