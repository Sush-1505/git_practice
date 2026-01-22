package stringPrograms;

public class RemoveAlphabets {

	public static void main(String[] args) {

		String s="sushil1234@";
		String str="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9' || ch=='@' ) {
				str=str+ch;	
			}
		}
		System.out.println(str);
	}

}
