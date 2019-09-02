package hms.intern;
import hms.intern.ServiceApp;

/**
 * Hello world!
 *
 */
public class CoreApp
{
    public static void main( String[] args )
    {getInput(args);

    }
    //method that get input
    public static void getInput(String[] args) {
        int[] array = new int[args.length];

        System.out.println("Elements of the array you entered");
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
            System.out.println(array[i]);

        }

        ServiceApp serviceApp = new ServiceApp();

        serviceApp.processOfSort(array);

    }
}