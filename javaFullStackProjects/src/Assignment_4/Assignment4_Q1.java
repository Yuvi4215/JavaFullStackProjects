package Assignment_4;

class Duplicate {
	boolean[] check = new boolean[26];

	public boolean[] findDuplicates(String word) {
		for (int i = 0; i < word.length(); i++) {
			check[(word.charAt(i) - 97)] = true;
		}
		return check;
	}
}

public class Assignment4_Q1 {

	public static void main(String[] args) {
		String word = "akhhgajfgkjjsjaa";
		String copy = "";
		Duplicate dp = new Duplicate();
		boolean[] checkArr = dp.findDuplicates(word);
		for (int i = 0; i < word.length(); i++) {
			if (checkArr[word.charAt(i) - 97]) {
				checkArr[word.charAt(i) - 97] = false;
				copy += word.charAt(i);
			}
		}
		System.out.println(copy);
	}

}
