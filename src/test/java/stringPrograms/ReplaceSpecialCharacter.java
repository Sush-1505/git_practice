package stringPrograms;

public class ReplaceSpecialCharacter {

	public static void main(String[] args) {

		String s="sushil@";
		String str="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') {
				str=str+ch;
			}
			else {
				str=str+'x';
			}
		}
		System.out.println(str);		
	}

}
