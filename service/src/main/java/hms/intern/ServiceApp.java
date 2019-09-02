package hms.intern;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ServiceApp {



	static void processOfSort(int[] array) {
		SelectionSort selectionSort = new SelectionSort(array);
		selectionSort.process();

		BubbleSort bubbleSort = new BubbleSort(array);
		bubbleSort.process();

		InsertionSort insertionSort = new InsertionSort(array);
		insertionSort.process();



	}

}
//the interface

interface SortInterface {

	void startTime();

	void process();

	void printOutput();

}

