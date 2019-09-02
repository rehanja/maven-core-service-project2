package hms.intern;

// class that containt logic of sort processes
public class InsertionSort implements SortInterface {
	int[] arr;
	long start;

	public InsertionSort(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void startTime() {
		start = System.nanoTime();
	}

	@Override
	public void process() {
		startTime();
// one by one move boundary of unsorted sub array

		for (int i = 0; i < arr.length - 1; i++) {

			// this is the pivot index
			// if unsorted sub array has minimum value than value represented
			// by this index, the values get swapped
			int minIndex = i;

			// find the minimum element in unsorted sub array
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}

			if (i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}

		}
		printOutput();
	}

	@Override
	public void printOutput() {
		long end = System.nanoTime();

		System.out.println("Insertion Execution time in nanoseconds  : " + (end - start));
		System.out.println("");
	}
}

