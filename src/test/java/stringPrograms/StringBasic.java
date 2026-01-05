package stringPrograms;

public class StringBasic {

	
		static void NumberOfWordslength() {
			String s="Update with new Skills";
			String []words=s.split(" ");
			for(String w:words) {
				System.out.println(w +" "+w.length());
			}
		}
		
		
		static void NumberOfWords(){
			String s="Update with new Skills";
			String[]words=s.split(" ");
			System.out.println(words.length);
			
		}
		
		static void ForLOOp() {
			String s="Update with new Skills";
			char c=0;
			for(int i=0;i<s.length();i++) {
				 c=s.charAt(i);
				if(c==' ') {
					c='_';
				}
				System.out.print("using for loop :" +c);
			}		
		}

		public static void main(String[] args) {
			NumberOfWordslength();
			NumberOfWords();
			ForLOOp();
			String s="Update with new Skills";
			char[]c=s.toCharArray();
			for(char word:c) {
				if(word==' ') {
					word='_';
					
				}
				System.out.print(word);

			}
			
		

	}

}
