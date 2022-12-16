package Assignment2;

import java.util.Scanner;

public class Assignment2_Q3 {
	static void printArray(int[] arr) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}

	public static void ascendingOrder(int option, int arr[]) {
		switch (option) {
		case 1: {
			System.out.println("Array before sort:");
			printArray(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {

					if (arr[j] > arr[j + 1]) {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("\nArray after sort");
			printArray(arr);
			break;
		}
		case 2: {
			System.out.println("Array before sort:");
			printArray(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					// using binary operator
					boolean check = (arr[j] > arr[j + 1]) ? true : false;
					if (check == false) {
						continue;
					} else {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("\nArray after sort");
			printArray(arr);
			break;
		}
		default:
			System.out.println("!!!   Invalid input");
		}
	}

	public static void descendingOrder(int option, int arr[]) {
		switch (option) {
		case 1: {
			System.out.println("Array before sort:");
			printArray(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {

					if (arr[j] < arr[j + 1]) {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("\nArray after sort");
			printArray(arr);
			break;
		}
		case 2: {
			System.out.println("Array before sort:");
			printArray(arr);
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					// using binary operator
					boolean check = (arr[j] < arr[j + 1]) ? true : false;
					if (check == false) {
						continue;
					} else {
						int temp;
						temp = arr[j + 1];
						arr[j + 1] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("\nArray after sort");
			printArray(arr);
			break;
		}
		default:
			System.out.println("!!!   Invalid input");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Bubble sort
		int[] arr = { 10, 52, 58, 54, 8, 48, 78, 44, 49 };
		System.out.println(
				"Input the value" + '\n' + "1: Array in ascending order" + '\n' + "2: Array of descending order");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: {// switch for Array of ascending order
			System.out.println("Input the value" + '\n' + "1: Output using normal methord" + '\n'
					+ "2: Output using Binary operator");
			int option = sc.nextInt();
			ascendingOrder(option, arr);
			break;
		}
		case 2: {// switch for Array of descending order
			System.out.println("Input the value" + '\n' + "1: Output using normal methord" + '\n'
					+ "2: Output using Binary operator");
			int option = sc.nextInt();
			descendingOrder(option, arr);
			break;
		}
		default:
			System.out.println("!! Invaild input");
		}

	}
}