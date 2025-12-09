package arrayPrograms;

public class AdditionOfArrays {
	
	public static void main(String[] args) {
		
	
	int x[]= {2,4,6,8,2,4};
	   
	int sum = 0;
	
	for(int i=0; i<x.length; i++) {
		 
		sum=sum+x[i];
		
	}
	
	System.out.println("Sum of element is "+sum);
	
}
}