package stringPrograms;

public class RemoveFirstOccurance {

	public static void main(String[] args) {

		String s="banana";
		
		String newString="";
		
//		for(int i=0;i<s.length();i++) {
//			
//			char ch=s.charAt(i);
//			if(ch!='a') {
//			
//				newString=newString+ch;
//			}		
//		}
//		
		
		for(char ch:s.toCharArray()) {
			
			if(ch !='a') {
				newString=newString+ch;
			}
		}
		System.out.println(newString);
	}

}
