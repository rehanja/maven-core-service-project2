package hms.intern;

// class that containt logic of sort processes
public class SelectionSort implements SortInterface {
    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public SelectionSort() {

    }


    @Override
    public void arrangeNumbers() {
        long start = System.nanoTime();
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
        long end = System.nanoTime();
        long time = end-start;
    printOutput(arr, time);
}

    @Override
    public void printOutput(int[] array, long time) {


        for (int f = 0; f < array.length; f++) {
            System.out.print(array[f] + "-");
        }

        System.out.println("Selection Execution time in nanoseconds  : " + (time));
        System.out.println();
    }
}

