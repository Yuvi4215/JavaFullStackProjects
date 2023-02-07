package Assignment_4;


class MaximumOccurringChar {
	private int[] arr = new int[26];
	private Integer maximum = 0;
	private int indexOfMax = 0;
	private Boolean flag = true;
	private Integer count = 0;

	public void runCalculations(String word) {
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i) - 97] += 1;
			if (arr[word.charAt(i) - 97] > maximum) {
				maximum = arr[word.charAt(i) - 97];
				indexOfMax = (int) word.charAt(i);
			}
		}
	}
	public void displayResults() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == maximum && count == 0) {
				System.out.println("Maximum Occurring char is :: " + (char) (i + 97));
				count++;
				flag = false;
			} else if (arr[i] == maximum && count > 0) {
				System.out.println("Another one is            :: " + (char) (i + 97));
			}
		}
		if (flag) {
			System.out.println(
					"Maximum Occurring char is :: " + (char) (indexOfMax) + "\nOccurring frequancy is :: " + maximum);
		} else {
			System.out.println("\nMaximum occurring frequancy is :: " + maximum);
		}
	}
}

public class Assignment4_Q8 {

	public static void main(String[] args) {
		
		MaximumOccurringChar max = new MaximumOccurringChar();
		max.runCalculations("katagauaihphqhwhrmybycyxyzvlvkvjv");
		max.displayResults();
	}

}
