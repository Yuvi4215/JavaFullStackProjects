package Assignment2;

import java.util.Scanner;

public class Assignment2_Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Main Array size:");
		int outer_num = sc.nextInt();
		System.out.println("Enter size of Array to check");
		int inner_num = sc.nextInt();
		int a[] = new int[outer_num];
		int b[] = new int[inner_num];
		System.out.println("Enter main Array elements:");
		for (int i = 0; i < outer_num; i++) {
			a[i] = sc.nextInt();
		}
		int j = 0;
		System.out.println("Enter Array to check");
		for (j = 0; j < inner_num; j++) {
			b[j] = sc.nextInt();
		}
		int x = 0;
		for (int i = 0; i < inner_num; i++) {
			for (j = 0; j < outer_num; j++) {
				if (b[i] == a[j]) {
					break;
				}
			}
			if (j == outer_num) {
				x = 1;
				System.out.println("Given Array is NOT a subset of main Array");
				break;
			}
		}
		if (x == 0) {
			System.out.println("Given Array IS a subset of the main Array");
		}
	}

}