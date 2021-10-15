package sef.FinalActivity;

import junit.framework.Assert;
import junit.framework.TestCase;

public class SecondActivityTest extends TestCase {
    //Attributes
    private SecondActivity.Calculator c;

    //Set up and tear down
    protected void setUp() throws Exception {
        super.setUp();
        c = new SecondActivity.Calculator();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    //Test methods
    public void testAddition() {

        assertEquals(7.0, c.add(2,5));
        assertEquals(1.0, c.add(-10, 11));
        assertEquals(0.0, c.add(0,0));

        double[] nums = {1, 2, 3, 4, 5};
        assertEquals(15.0, c.add(nums));

    }

    public void testSubtraction() {

        assertEquals(5.0, c.subtract(10, 5));
        assertEquals(-20.0, c.subtract(-10, 10));
        assertEquals(0.0, c.subtract(0, 0));
    }

    public void testMultiplication() {

        assertEquals(10.0, c.multiply(2,5));
        assertEquals(-10.0, c.multiply(-1, 10));
        assertEquals(0.0, c.multiply(0,0));

        double[] nums = {1, 2, 3, 4, 5};
        assertEquals(120.0, c.multiply(nums));
    }

    public void testDivision() {

        assertEquals(2.0, c.divide(10,5));
        assertEquals(-0.1, c.divide(-1, 10));
        double infRes = c.divide(5, 0);
        assert Double.isInfinite(infRes);

        double[] nums = {1, 2, 3, 4, 5};
        assertEquals(120.0, c.multiply(nums));
    }

}
