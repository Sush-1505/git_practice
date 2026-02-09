package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindVowelsCount {

	public static void main(String[] args) {

		String str = "I LOVE java PROgramming"; // I1 LOVE2 JAVA2 PROGRAMMING3

		String x[] = str.split(" ");
		char ch;
		ArrayList list = new ArrayList();

		for (int i = 0; i < x.length; i++) {
			list.add(x[i]);
			int count = 0;
			for (int j = 0; j < x[i].length(); j++) {
				String m = x[i].toLowerCase();
				ch = m.charAt(j);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					count++;
				}
			}
			System.out.print(x[i] + "" + count + " ");
		}

	}

}
 