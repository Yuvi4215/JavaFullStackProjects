package Assignment_4;


import java.util.Scanner;

class Duplicates {
	boolean[] boolArray = new boolean[26];

	public boolean[] calculate(String word) {
		for (int i = 0; i < word.length(); i++) {
			int outer = word.charAt(i) - 97;
			if (outer<0) {
				outer+=32;
			}
			for (int j = i + 1; j < word.length(); j++) {
				int inner = word.charAt(j) - 97;
				if (inner<0) {
					inner+=32;
				}
				if (outer == inner) {
					boolArray[inner] = true;
				}
			}
		}
		return boolArray;
	}

	public void printResults(boolean[] boolArray) {
		int count = 0;
		for (int i = 0; i < boolArray.length; i++) {
		if(count==0 && boolArray[i]==true) {
			System.out.println("Found Duplicate Characters.");
			System.out.print((char)(i+97)+" ");
			count++;
		}
			else if (boolArray[i] == true) {
				System.out.print((char)(i+97)+" ");
			}
		}
		if (count==0) {
			System.out.println("No Duplicate Charaters.");
		}
	}
}

public class Assignment4_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the word.");
		String word= sc.nextLine();
		Duplicates findDuplicate = new Duplicates();
		findDuplicate.printResults(findDuplicate.calculate(word));
	}
}
