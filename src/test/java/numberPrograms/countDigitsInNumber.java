package numberPrograms;

public class countDigitsInNumber {

	public static void main(String[] args) {

		int a=1234;
		int count=0;
		int sum=0;
		
		while(a>0) {
			
			int d=a%10;  
			a=a/10;
			sum=sum+d;
			count++;
		}
		
		System.out.println(count);
		System.out.println(sum);
	}

}
