package workshop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsTest {
    @Test
    public void testCount() throws Exception {

        int input = 43;
        int result = 4;

        CountBits countBits = new CountBits();

        Assert.assertEquals("Normally value", result, countBits.count(input));
    }

    @Test
    public void testCountMax() throws Exception {

        int input = Integer.MAX_VALUE;
        int result = 31;

        CountBits countBits = new CountBits();

        Assert.assertEquals("Max", result, countBits.count(input));
    }

    @Test
    public void testCountNegative() throws Exception {

        int input = -13;
        int result = 4;

        CountBits countBits = new CountBits();

        Assert.assertEquals("Negative value", result, countBits.count(input));
    }

    @Test
    public void testCountNegativeMin() throws Exception {

        int input = -2147483647;
        int result = 2;

        CountBits countBits = new CountBits();

        Assert.assertEquals("Negative min value", result, countBits.count(input));
    }
}