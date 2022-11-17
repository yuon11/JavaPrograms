package school;

import org.junit.Assert;
import org.junit.Test;

public class TestNewStudent {

    @Test
    public void testInitializers() {

        // it should respond like this:
//    if (result != 200) {
//      throw new Exception("That's the wrong answer: " + result);
//    }
        // Assert.assertEquals("99 + 101 should produce 200", 200, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalInitializers() {
    }

    @Test
    public void testGetName() {
        // should get this result
        // Assert.assertEquals("tau should be 6.28", 6.28, result, 0.000001);
    }

    @Test
    public void testSetName() {
        // Assert.assertEquals("8 / 4 should be 2", 2.0,Computations.divide(8, 4), 0.00001);
    }

    @Test
    public void testGetGpa() {
        // should get this result
        // Assert.assertEquals("tau should be 6.28", 6.28, result, 0.000001);
    }

    @Test
    public void testSetGpa() {
        // Assert.assertEquals("8 / 4 should be 2", 2.0,Computations.divide(8, 4), 0.00001);
    }

    @Test
    public void testGetCourses() {
        // should get this result
        // Assert.assertEquals("tau should be 6.28", 6.28, result, 0.000001);
    }

    @Test
    public void testSetCourses() {
        // Assert.assertEquals("8 / 4 should be 2", 2.0,Computations.divide(8, 4), 0.00001);
    }

}
