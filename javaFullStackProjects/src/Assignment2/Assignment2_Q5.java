package Assignment2;

class SelectionSort {
	void arraySort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

	void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}

public class Assignment2_Q5 {

	public static void main(String[] args) {
		int[] arr = { 10, 52, 58, 54, 8, 48, 78, 44, 49 };
		SelectionSort sSort = new SelectionSort();
		System.out.println("Before Selection Sort");
		sSort.printArray(arr);
		sSort.arraySort(arr);
		System.out.println("\nAfter Selection Sort");
		sSort.printArray(arr);
	}
}