package workshop1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumDigitsTest {

    @Test
    public void testSumBorderMax() throws Exception {

        SumDigits sumDigits = new SumDigits();
        int number = -2147483648;
        int result = 47;

        Assert.assertEquals("Check max integer", result, sumDigits.sum(number));

    }

    @Test
    public void testSumNormallyInput() throws Exception {

        SumDigits sumDigits = new SumDigits();
        int number = 123;
        int result = 6;

        Assert.assertEquals("Check normally value", result, sumDigits.sum(number));

    }

    @Test
    public void testSumNegativeInput() throws Exception {

        SumDigits sumDigits = new SumDigits();
        int number = -123;
        int result = 6;

        Assert.assertEquals("Check negative value", result, sumDigits.sum(number));

    }

    public void testSumZero() throws Exception {

        SumDigits sumDigits = new SumDigits();
        int number = 0;
        int result = 0;

        Assert.assertEquals("Check argument is zero", result, sumDigits.sum(number));

    }


}