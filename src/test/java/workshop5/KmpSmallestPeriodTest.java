package workshop5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KmpSmallestPeriodTest {

    @Test
    public void findSmallestPeriod() throws Exception {
        String input = "abcabcabcabc";
        String result = "abc";

        KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();

        Assert.assertEquals("abc", result, kmpSmallestPeriod.findSmallestPeriod(input));
    }

    @Test
    public void findSmallestPeriodNext() throws Exception {
        String input = "abdabcabdabc";
        String result = "abdabc";

        KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();

        Assert.assertEquals("abdabc", result, kmpSmallestPeriod.findSmallestPeriod(input));
    }

    @Test
    public void findSmallestPeriodOneChar() throws Exception {
        String input = "abcdefg";
        String result = null;

        KmpSmallestPeriod kmpSmallestPeriod = new KmpSmallestPeriod();

        Assert.assertEquals("abcdefg", result, kmpSmallestPeriod.findSmallestPeriod(input));
    }



}