package hms.intern;

// class that containt logic of sort processes
public class InsertionSort implements SortInterface {
    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }


    @Override
    public void arrangeNumbers() {
        long start = System.nanoTime();
// one by one move boundary of unsorted sub array

        for (int i = 1; i < arr.length; i++) {
            // get first element of unsorted part
            int key = arr[i];

            // iterate through sorted list from top to botton
            // iterate until it finds lesser element than key
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // shift elements to right
                arr[j + 1] = arr[j];
                // decrement counter
                j--;
            }
            arr[j + 1] = key;
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

        System.out.println("Insertion Execution time in nanoseconds  : " + (time));
        System.out.println();
    }
}

