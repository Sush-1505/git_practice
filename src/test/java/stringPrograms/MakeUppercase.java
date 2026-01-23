package stringPrograms;

public class MakeUppercase {

	public static void main(String[] args) {

		String input="sushil";
		String output="";
		
		String words[]=input.split("");
		words[0]=words[0].toUpperCase();
				
		for(int i=0;i<words.length;i++) {
			
			output=output+words[i];	
		}	
		
		System.out.println(output);
	}

}
