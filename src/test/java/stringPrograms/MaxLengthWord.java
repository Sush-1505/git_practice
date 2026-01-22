package stringPrograms;

public class MaxLengthWord {

	public static void main(String[] args) {

		String s="My name is Sushil";
		String min="";
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>min.length()) {
				min=a[i];	
			}
		}
		
		System.out.println(min);
	}

}
