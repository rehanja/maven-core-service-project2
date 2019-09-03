package hms.intern;

import hms.intern.CoreApp;

public class ServiceApp {
    public static void main(String[] args) {
        getInput(args);

    }

    //method that get input
    public static void getInput(String[] args) {
        int[] array = new int[args.length];

        System.out.println("Elements of the array you entered");
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.println(array[i]);

        }

        CoreApp CoreApp = new CoreApp();

        hms.intern.CoreApp.processOfSort(array);

    }

}
