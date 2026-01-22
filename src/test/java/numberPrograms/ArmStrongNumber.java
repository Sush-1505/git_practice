package numberPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int a=157;
		int original = a;
		int sum=0;
		int cube=0;
		
			while(a>0) {
			int newNumber=a%10; 
			cube=newNumber*newNumber*newNumber;
			a=a/10;     
			sum=sum+cube;
		}
				
		if(original==sum) {
			System.out.println("Number is Armstrong "+original);
		}
		else {
			System.out.println("Number is not Armstrong "+original);
		}

	}

}
