package stringPrograms;

public class FindUniqueCharacter {

	public static void main(String[] args) {

		String s="aabb@ccdd";
		
		int unique=0;
		for(int i=0;i<s.length();i++) {
			
			unique=s.charAt(i)^unique;
			
		}
		
		System.out.println((char)unique);
	}

}
