package stringPrograms;

public class AdditionOfString {

//	public static void main(String[] args) {
//
//		String s="sushil123deshmukh55";
//		int sum=0;
//		String d="";
//		
//		for(int i=0;i<s.length();i++) {
//			char a=s.charAt(i);
//			if(a>='0'&& a<='9') {
//				d=d+s.charAt(i);	
//			}
//		}
//		
//		int num=Integer.parseInt(d);
//		System.out.println(num);
//		
//		int count=0;
//		
//		while(num>0) {
//			sum=sum+num%10;          //123%10=3     12%10=2     1%10=1
//			num=num/10;              //123/10=12    12/10=1     1/10=0
//			count++;
//		}
//		System.out.println(count+" Digits Sum is "+sum);
//	}
	
	public static void main(String[] args) {

	    String s = "sushil123deshmukh55";
	    int sum = 0;
	    int count = 0;

	    for (int i = 0; i < s.length(); i++) {
	        char ch = s.charAt(i);

	        if (ch >= '0' && ch <= '9') {
	            int digit = ch - '0';   // convert char to number   
	            sum=sum+ digit;      
	            count++;
	        }
	    }

	    System.out.println(count + " Digits Sum is " + sum);
	}
}
