package stringPrograms;

public class ReverseWholeStringWithoughtChangingIndex {

	public static void main(String[] args) {

		 String s="Aruna Parre";
	       
	       String[]a=s.split(" ");
	       
	       String nw="";
	       
//	       for(int i=0;i<a.length;i++){
//	           String[] b=a[i].split("");
//	           
//	           for(int j=b.length-1;j>=0;j--){
//	               nw=nw+b[j];
//	           }
//	       }
	       
	       //following code is for Only Single String Reverse
	       
	       for(int i=a[1].length()-1;i>=0;i--) {
	    	   nw=nw+a[1].charAt(i);
	       }
	       System.out.println(nw);
	}

}
