package Assignment_4;

class CheckForPangram {
	private boolean[] check = new boolean[26];
	private boolean flag = true;

	public void panagramCheck(String wordCollection) {
		for (int i = 0; i < wordCollection.length(); i++) {
			if (wordCollection.charAt(i) < 97) {
				continue;
			} else {
				check[wordCollection.charAt(i) - 97] = true;
			}
		}
	}

	public void displayResults() {
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false) {
				System.out.println("Not Pangram.");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("String is pangarm");
		}
	}
}

public class Assignment4_Q6 {

	public static void main(String[] args) {
		CheckForPangram check = new CheckForPangram();
		check.panagramCheck("two driven jocks help fax my big quiz");
		check.displayResults();
	}

}
