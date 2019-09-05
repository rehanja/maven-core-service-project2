package hms.intern;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.*;

public class ServiceAppTest {
    ServiceApp sc;
    String str1, str2;

    @BeforeMethod
    public void setUp() {
        sc =new ServiceApp();
        str1 = "abc";
        str2 = "def";

    }

/*
    @Test (priority = 1)
        public void testgetInput(String[] args) {

        Assert.assertNotNull(sc.getInput("5 3 2"));
        Assert.assertEquals(sc.mergeStrings(str1, str2), "abcdef");
    }
*/


    @AfterMethod
    public void tearDown() {
        str1 = null;
        str2 = null;
        sc = null;
    }
}