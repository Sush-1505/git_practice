package numberPrograms;

public class ArmstrongNumberForAll {

	public static void main(String[] args) {

		int a=153;
		int original = a;
		int finalNumber=a;
		int sum=0;
		int cube=0;
		int count=0;
		
		while(a>0) {	
			int c=a%10;
			a=a/10;
			count++;
		}
		
		while(original>0) {
			int newNumber=original%10; 
			//cube=newNumber*newNumber*newNumber;
			cube=(int) Math.pow(newNumber, count);
			original=original/10;     
			sum=sum+cube;
		}
				
		if(finalNumber==sum) {
			System.out.println("Number is Armstrong "+finalNumber);
		}
		else {
			System.out.println("Number is not Armstrong "+finalNumber);
		}
		
	}

}
