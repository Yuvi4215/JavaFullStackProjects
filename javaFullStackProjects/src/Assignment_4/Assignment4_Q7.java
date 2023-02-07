package Assignment_4;

class Unique {
	int[] arr = new int[94];
	boolean check = true;

	public void calculate(String wordCollection) {
		for (int i = 0; i < wordCollection.length(); i++) {
			arr[wordCollection.charAt(i) - 32] += 1;
		}
	}

	public void evaluate() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
				System.out.println("Not all characters of String is/are unique.");
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("String consist of All unique Charecters.");
		}
	}
}

public class Assignment4_Q7 {

	public static void main(String[] args) {
		String wordCollection = " 1234567890qwertyuiopasdfghjklzxcvbnm!@#$%^&*()_+{}:'<>?";
		Unique run = new Unique();
		run.calculate(wordCollection);
		run.evaluate();
	}

}
