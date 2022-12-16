package Assignment2;

class QuickSort {

	int devide(int arr[], int lower, int higher) {
		int pivot_elem = arr[higher];
		int i = (lower - 1);
		for (int j = lower; j < higher; j++) {
			if (arr[j] <= pivot_elem) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[higher];
		arr[higher] = temp;

		return i + 1;
	}

	void sort(int arr[], int lower, int higher) {
		if (lower < higher) {
			int pi = devide(arr, lower, higher);
			sort(arr, lower, pi - 1);
			sort(arr, pi + 1, higher);
		}
	}

	void printArray(int arr[]) {
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}

public class Assignment2_Q2 {

	public static void main(String[] args) {
		int arr[] = { 10, 52, 58, 54, 8, 48, 78, 44, 49 };
		QuickSort qikSort = new QuickSort();
		System.out.println("Array before sort:");
		qikSort.printArray(arr);
		qikSort.sort(arr, 0, arr.length - 1);
		System.out.println("\nArray after Quicksort");
		qikSort.printArray(arr);
	}
}
