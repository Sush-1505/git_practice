package arrayPrograms;

public class FindDuplicate {

	public static void main(String[] args) {

		  int[] arr = {2, 2, 4, 3, 4, 5, 6, 2, 7};

	        System.out.println("Duplicate numbers:");

	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;

	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                	count++;
	               // 	System.out.println(arr[i]);
	               //     break;
	                }
	            }

	            if (count >1) {
	                System.out.println(arr[i]);
	            }
	        }
	}

}
