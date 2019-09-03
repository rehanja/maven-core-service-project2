package hms.intern;

// class that containt logic of sort processes
public class BubbleSort implements SortInterface {
    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }


    @Override
    public void arrangeNumbers() {
        long start = System.nanoTime();

// one by one move boundary of unsorted sub array
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                // if i'th element is larger than (i + 1)'th element, swap them
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        long time = end - start;
        printOutput(arr, time);
    }

    @Override
    public void printOutput(int[] array, long time) {


        for (int f = 0; f < array.length; f++) {
            System.out.print(array[f] + "-");
        }

        System.out.println("Bubble Execution time in nanoseconds  : " + (time));
        System.out.println();
    }
}

