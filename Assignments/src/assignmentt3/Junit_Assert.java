package assignmentt3;

import org.junit.Assert;
import org.junit.Test;

//W.a.junit program to handled Assert class with all method to check its pass or fail
public class Junit_Assert {

	@Test
    public void AssertEquals() {
        int a1 = 5;
        int a2 = 6;
        Assert.assertEquals("Test failed: Values are not equal", a1, a2);
    }

    @Test
    public void AssertNotEquals() {
        int a3 = 5;
        int a4 = 3 + 2;
        Assert.assertNotEquals("Test failed: Values should be different", a3, a4);
    }

    @Test
    public void AssertTrue() {
        int a5 = 100;
        int a6 = 20;
        Assert.assertTrue("Test failed: Condition is false", a5 < a6);
    }

    @Test
    public void AssertFalse() {
        int a7 = 100;
        int a8 = 20;
        Assert.assertFalse("Test failed: Condition is true", a7 < a8);
    }

    @Test
    public void AssertSame() {
        String s1 = "Adii";
        String s2 = "Adii";
        Assert.assertSame("Test failed: Objects are not the same", s1, s2);
    }

    @Test
    public void AssertNotSame() {
        String s1 = new String("Adii");
        String s2 = new String("Adii");
        Assert.assertNotSame("Test failed: Objects are the same", s1, s2);
    }

    @Test
    public void AssertNull() {
        String s3 = null;
        Assert.assertNull("Test failed: Object is not null", s3);
    }

    @Test
    public void AssertNotNull() {
        String s4 = "Not Null";
        Assert.assertNotNull("Test failed: Object is null", s4);
    }

    @Test
    public void AssertArrayEquals() {
        int[] a8 = {10, 20, 30};
        int[] a9 = {10, 20, 31};
        Assert.assertArrayEquals("Test failed: Arrays are not equal", a8, a9);
    }
}