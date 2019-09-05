package hms.intern;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SelectionSortTest {
    CoreApp selectionSortTest;

    @BeforeMethod
    public void setUp() {
        selectionSortTest = new CoreApp();
    }


    @Test
    public void testSelectionSorts() {

        int[] array = new int[]{1, 50, 0};
        int[] resultArray = new int[]{1, 50, 0};

        CoreApp.processOfSort(array);
        int[] sortedArray = array;

        // Assert.assertNotNull(array);
        assertEquals(sortedArray, resultArray);
    }
    @Test
    public void testSelectionSortNull() {

        int[] array = new int[]{1, 50, 0};

        CoreApp.processOfSort(array);
        int[] sortedArray = array;

        Assert.assertNotNull(array);

    }



    @AfterMethod
    public void tearDown() {
        selectionSortTest = null;
    }
}