package collectionPrograms;

import java.util.HashSet;

public class DuplicateNumberMoreThanOneTime {

	public static void main(String[] args) {

		int x[] = { 2, 2, 2, 5, 4, 4, 5, 4, 8, 7 };


		        HashSet<Integer> set = new HashSet<>();
		        HashSet<Integer> duplicates = new HashSet<>();

		        for (int num : x) {
		            if (!set.add(num)) { 
		                // If add() returns false → duplicate
		                duplicates.add(num);
		            }
		        }

		        System.out.println("Duplicates: " + duplicates);
		    }
		} 

	

