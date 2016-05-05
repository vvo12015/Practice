package workshop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetZeroTest {
    @Test
    public void testSetZero() throws Exception {
        int input = 6;
        int result = 4;

        SetZero setZero = new SetZero();

        Assert.assertEquals("equals", result, setZero.set(input, 1));
    }

}