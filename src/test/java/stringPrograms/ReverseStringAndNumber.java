package stringPrograms;

public class ReverseStringAndNumber {

	public static void main(String[] args) {

		String s="ABC123@#$";   //CBA321
		String h="";
		
		StringBuilder letter=new StringBuilder();
		StringBuilder digits=new StringBuilder();
		StringBuilder specialch=new StringBuilder();
		
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)) {
				letter.append(ch);
			}
			
			else if(Character.isDigit(ch)) {
				digits.append(ch);
			}
			
			else {
				specialch.append(ch);
			}
		}
			letter.reverse();
			digits.reverse();
			specialch.reverse();
			
			h=letter.toString()+digits.toString()+specialch.toString();
			
			System.out.println(h);
			
		}	
	}