package workshop2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SetZeroTest {

    @Test
    public void testSetZeroPositive() throws Exception {
        int input = 6;
        int result = 4;

        SetZero setZero = new SetZero();

        Assert.assertEquals("normally value", result, setZero.set(input, 1));
    }

    @Test
    public void testSetOne() throws Exception {

        int input = -1;
        int result = -1073741825;

        SetZero setZero = new SetZero();

        Assert.assertEquals("check on one", result, setZero.set(input, 31));
    }

    @Test
    public void testSetZeroNegative() throws Exception {

        int input = -1;
        int numberBit = 31;
        int result = -1073741825;

        SetZero setZero = new SetZero();

        Assert.assertEquals("check min", result, setZero.set(input, numberBit));
    }
}