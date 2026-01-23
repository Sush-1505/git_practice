package stringPrograms;

public class MakeUppercaseAllFirstElement {

	public static void main(String[] args) {

		String input="sushil deshmukh";
		String output="";
		
		String[] words=input.split(" ");
		
		for(int j=0;j<words.length;j++) {
			String chars[]=words[j].split("");
			chars[0]=chars[0].toUpperCase();
		
        for(int i=0;i<chars.length;i++) {
	
			output=output+chars[i];	
		}	
        
        output=output+" ";
		}
		System.out.println(output);
		
		
//		String[]g=s.split(" ");
//		
//		String a=g[0].toString();
//		
//		String [] q=a.split("");
//		q[0]=q[0].toUpperCase();
//		
//		for(int i=0;i<q.length;i++) {
//			n=n+q[i];
//		}
//		
//		System.out.println(n);
		
	}

}
