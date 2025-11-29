package arrayPrograms;

public class FindMissingNumber {

	public static void main(String[] args) {

		int a[]= {0,1,3};
		int l=a.length;          //if there is no zero in array then add +1 in length
		int sum=l*(l+1)/2;  
		int sum1=0;
		
		System.out.println(sum);
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		System.out.println(sum1);
		int missing=sum-sum1;
		System.out.println(missing);	
	}

}
