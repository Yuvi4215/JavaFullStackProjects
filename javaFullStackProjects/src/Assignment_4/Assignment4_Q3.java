package Assignment_4;

import java.util.Scanner;

class Palindrome {
	int count;

	public void checkPalindrome(String word) {
		// shortcut method uses half loop only
		for (int i = 0; i < word.length() / 2; i++) {
			int first = i;
			int last = word.length() - 1 - i;
			char f = word.charAt(first);
			char l = word.charAt(last);
			if (f != l) {
				System.out.println("String is not Palindromic.\n");
				break;
			} else {
				count++;
			}
		}
		if (count == word.length() / 2) {
			System.out.println("String is Palindromic.\n");
		}
	}
}

public class Assignment4_Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palindrome palindrome = new Palindrome();
		System.out.println("Choose option from following.\n" + "1.To enter your own String.\n"
				+ "2.To continue with String :: 2552\n");
		int option = sc.nextInt();
		switch (option) {
		case 1: {
			System.out.println("Please enter the String.");
			String word = sc.next();
			palindrome.checkPalindrome(word);
			break;
		}
		case 2: {
			palindrome.checkPalindrome("2552");
			break;
		}

		default:
			System.out.println("!!!!!!!!!  Invalid input !!!!!!!!!");
		}
		System.out.println("Programm is terminated sucessfully.");
	}
}
