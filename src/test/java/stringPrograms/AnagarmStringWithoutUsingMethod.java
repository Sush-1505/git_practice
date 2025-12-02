package stringPrograms;

public class AnagarmStringWithoutUsingMethod {

	public static void main(String[] args) {

		String a = "tone";
		String b = "note";
		int l1 = a.length();
		int l2 = b.length();
		int count1 = 0;
		int count2 = 0;
		boolean flag = false;

		if (l1 == l2) {
			for (int i = 0; i < a.length(); i++) {
				for (int j = 0; j < b.length(); j++) {

					if (a.charAt(i) == a.charAt(j)) {
						count1++;
					}
					if (a.charAt(i) == b.charAt(j)) {
						count2++;
					}
				}
				if (count1 == count2) {
					flag = true;
					continue;
				}

				else {
					flag = false;
				}

			}
			if (flag == true)
				System.out.println("Anagram");

			else
				System.out.println("Not anagram");
		} else {
			System.out.println("Not anagram");
		}
	}
}
