package stringPrograms;

public class FindLongestWord {

	public static void main(String[] args) {
              
		String str= "My name is Aruna";
		
		String words[] = str.split(" ");
		String longestWord="";
		
		for(String word : words)  {
			if (word.length()>longestWord.length()) {
				longestWord = word;
				
			}
			
		}
		System.out.println(longestWord);
	}

}
