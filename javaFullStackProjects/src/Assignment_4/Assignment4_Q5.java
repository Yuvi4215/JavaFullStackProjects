package Assignment_4;

public class Assignment4_Q5 {

	public static void main(String[] args) {
		boolean circuit = true;
		String name = "fabdceg";
		String word = "abcdefg";
		int[] arr = new int[word.length()];
		if (name.length() != word.length()) {
			System.out.println("since length of string is not same it is not anagram");
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = word.charAt(i);
			}
			for (int i = 0; i < name.length(); i++) {
				for (int j = 0; j < arr.length; j++) {
					if (name.charAt(i) == arr[j]) {
						arr[j] = -1;
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					System.out.println("String is not an Anagram.");
					circuit = false;
					break;
				}
			}
			if (circuit) {
				System.out.println("String is Anagram");
			}
		}
	}

}
