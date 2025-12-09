package arrayPrograms;

public class AddNumberInArray {
   
	public static void main(String[] args) {
		
		int[] Y = {10, 20, 30, 40};
		int index = 4;  // position where you want to add
		int num = 50;

		int[] newArr = new int[Y.length + 1];

		for (int i = 0, j = 0; i < newArr.length; i++) {
		    if (i == index) {
		        newArr[i] = num;  // insert number
		    } else {
		        newArr[i] = Y[j];
		        j++;
		    }
		}
        
		for (int x : newArr) {
			
		    System.out.print(x+" ");
		}
	}
}
