package hms.intern;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CoreApp {

    static void processOfSort(int[] array) {
        System.out.println("selectionSort");
        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.arrangeNumbers();

        System.out.println("Bubble sort");
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.arrangeNumbers();

        System.out.println("insertion sort ");
        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.arrangeNumbers();
    }

}


