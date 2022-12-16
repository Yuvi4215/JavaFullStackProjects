package Assignment2;

class ArrayDuplicate {
	int[] arr;

	public void printResults(int... array) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] < 0) {
				continue;
			}
			for (int j = i + 1; (j < arr.length); j++) {
				if (arr[j] >= 0) {
					if (arr[i] == arr[j] && count == 1) {
						count++;
						System.out.println("Element found for: " + arr[i] + '\n' + "At index: --->" + j);
						arr[j] = -1;
					} else if (arr[i] == arr[j] && count > 1) {
						count++;
						System.out.println("Than again at index: --->" + j);
						arr[j] = -1;
					}
				}
			}
			System.out.println('\n');
		}
	}

	public ArrayDuplicate(int num) {
		this.arr = new int[num];
	}

}

public class Assignment2_Q1 {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 0, 45, 66, 88, 10, 9, 0, 5, 66, 10, 12, 45, 66, 88, 10, 10, 88, 9, 0, 8, 5 };
		ArrayDuplicate ad = new ArrayDuplicate(arr.length);
		ad.printResults(arr);

	}
}
