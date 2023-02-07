package Assignment_4;

class CountTheChar {
	private int[] arr = new int[94];
	private int countVowels = 0;
	private int countSpecialChar = 0;
	private int countConsonants = 0;
	private int countNumbers = 0;

	public void findCount(String word) {
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 32] += 1;
		}
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 32;
			if (index > 15 && index < 26) {
				countNumbers += 1;
			} else if ((index < 33) || (index > 90 || (index > 58 && index < 65))) {
				countSpecialChar += 1;
			} else if (index == 33 || index == 37 || index == 41 || index == 47 || index == 53 || index == 65
					|| index == 69 || index == 73 || index == 79 || index == 85) {
				countVowels += 1;
			} else {
				countConsonants += 1;
			}
		}
	}

	public void displayCount() {
		System.out.println("Total Count of Consonents are :: " + countConsonants + "\n\n");
		System.out.println("Total Count of Vowels are :: " + countVowels + "\n\n");
		System.out.println("Total Count of Numbers in String are :: " + countNumbers + "\n\n");
		System.out.println("Total Count of Special Characters are :: " + countSpecialChar + "\n\n");
	}

}

public class Assignment4_Q4 {

	public static void main(String[] args) {
		CountTheChar counter = new CountTheChar();
		counter.findCount("  1234567890AEIOUqwertyuiopasdfghjklzxcvbnm!@#$%^&*()_+{}:'<>?");
		counter.displayCount();
	}

}
