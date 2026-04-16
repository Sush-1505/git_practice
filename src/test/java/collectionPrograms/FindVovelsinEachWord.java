 package collectionPrograms;

import java.util.ArrayList;

public class FindVovelsinEachWord {

	public static void main(String[] args) {

		String s = "java is programing language";
		String[] a = s.split(" ");

		ArrayList<String> al = new ArrayList<String>();

		for (int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}

		int totalcount = 0;
		for (String itr : al) {

			int count = 0;
			for (int j = 0; j < itr.length(); j++) {
				
				if (itr.charAt(j) == 'a' || itr.charAt(j) == 'e' || itr.charAt(j) == 'i' || itr.charAt(j) == 'o'
						|| itr.charAt(j) == 'u') {
					count++;
					totalcount++;
				}

			}
			System.out.print(itr + " " + count + "  ");
		}

		System.out.println(totalcount);
	}

}
