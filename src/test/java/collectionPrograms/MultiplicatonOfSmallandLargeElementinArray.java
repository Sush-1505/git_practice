package collectionPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class MultiplicatonOfSmallandLargeElementinArray {

	public static void main(String[] args) {

		int[] a = { 8, 1, 6, 3, 9 };

		TreeSet<Integer> al = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}

		ArrayList<Integer> aruna = new ArrayList<Integer>(al);

		int multi = aruna.get(aruna.size() - 2); // 5-2=3
		int mul = aruna.get(1);

		System.out.println(mul * multi);
	}

}
