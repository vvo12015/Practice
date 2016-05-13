package workshop3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestStabilityPeriodTest {

    @Test
    public void testCountSexElements() throws Exception {

        int[] input = {1, 0, 0, 1, 0, 1, 2, 3, 0, 1, 1};
        int result = 6;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("6 elements", result, longestStabilityPeriod.count(input));
    }

    @Test
    public void testCountEightElements() throws Exception {

        int[] input = {900, 900, 900, 901, 902, 902, 903, 903};
        int result = 4;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("8 elements", result, longestStabilityPeriod.count(input));
    }

    @Test
    public void testCountFifteenElements() throws Exception {

        int[] input = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901, 901, 901, 902, 901, 902};
        int result = 8;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("15 elements", result, longestStabilityPeriod.count(input));
    }


    @Test
    public void testCountOneElement() throws Exception {

        int[] input = {1};
        int result = 1;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("1 elements", result, longestStabilityPeriod.count(input));
    }

    @Test
    public void testCountTwoElementEquals() throws Exception {

        int[] input = {1, 1};
        int result = 2;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("2 equals elements", result, longestStabilityPeriod.count(input));
    }

    @Test
    public void testCountTwoElementNoEquals() throws Exception {

        int[] input = {1, 3};
        int result = 1;

        LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();

        Assert.assertEquals("1 no equals elements", result, longestStabilityPeriod.count(input));
    }


}