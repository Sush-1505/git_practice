package stringPrograms;

 public class MaxLengthWord {

	public static void main(String[] args) {

		String s="My name is Sushil";
		String max="";
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];	
			}
		}
		
		System.out.println(max);
	}

}
