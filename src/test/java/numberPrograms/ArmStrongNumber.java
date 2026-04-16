package numberPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int a=153;
		int original = a;
		int sum=0;
		int cube=0;
		
			while(a>0) {
			int newNumber=a%10;  //3     5    1
			cube=newNumber*newNumber*newNumber;   //27    125   1
			a=a/10;    //15     1     0
			sum=sum+cube;    //0+27     27+125=152    152+1=153
		}
				
		if(original==sum) {
			System.out.println("Number is Armstrong "+original);
		}
		else {
			System.out.println("Number is not Armstrong "+original);
		}

	}

}
