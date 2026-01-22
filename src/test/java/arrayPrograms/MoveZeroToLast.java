package arrayPrograms;

public class MoveZeroToLast {

	public static void main(String[] args) {

		int a[]= {1,0,2,0,3,0,4};
	
		for(int i=0;i<a.length;i++) {                
			for(int j=0;j<a.length;j++) {    
				if(a[j]==0) {
					int temp=0;
					a[j]=a[i];         
					a[i]=temp;      
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
