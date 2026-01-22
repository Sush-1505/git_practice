package numberPrograms;

public class FibonanciSeries {

	public static void main(String[] args) {

		int a=20;    //0+1=1   1+1=2   2+1=3  3+2=5  3+5=8     0 1 1 2 3 5 8
		
		int b=0;
		int c=1;
		int sum=0;
		
		for(int i=0;i<a;i++) {
			
			 sum=b+c;      
			 b=c;            
			 c=sum;     
			 System.out.print(sum+" ");
			 
		}
		
	
	}

}
