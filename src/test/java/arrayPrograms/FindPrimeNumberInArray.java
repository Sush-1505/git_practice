package arrayPrograms;

public class FindPrimeNumberInArray {

	public static void main(String[] args) {

		int a[]= {11,12,13,14,15,16,17};
				
		for(int i=0;i<a.length;i++) {     
			int b=a[i];            
			int count=0;
			for(int j=1;j<=b;j++) {     
				
				if(b%j==0) {
					count++;
				}
			}
			
			if(count>2) {
				System.out.println(a[i]+" Number is not Prime ");
			}
			else {
				System.out.println(a[i]+" Number is prime ");
			}
		}
	}

}
