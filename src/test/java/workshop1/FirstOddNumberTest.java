package workshop1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstOddNumberTest {

    @Test
    public void testFindOneElementFresh() throws Exception {

        int[] input = {2};
        int result = -1;

        FirstOddNumber firstOddNumber = new FirstOddNumber();

        Assert.assertEquals("One fresh element", result, firstOddNumber.find(input));
    }

    @Test
    public void testFindOneElementZero() throws Exception {

        int[] input = {0};
        int result = -1;

        FirstOddNumber firstOddNumber = new FirstOddNumber();

        Assert.assertEquals("One zero element", result, firstOddNumber.find(input));
    }

    @Test
    public void testFindOneElementOdd() throws Exception {

        int[] input = {3};
        int result = 0;

        FirstOddNumber firstOddNumber = new FirstOddNumber();

        Assert.assertEquals("One fresh element", result, firstOddNumber.find(input));
    }

    @Test
    public void testFindEmptyInput() throws Exception {

        int[] input = {};
        int result = -1;

        FirstOddNumber firstOddNumber = new FirstOddNumber();

        Assert.assertEquals("Empty array", result, firstOddNumber.find(input));
    }

    @Test
    public void testFind() throws Exception {

        int[] input = {2, 4, 6, 18, 200, 46, 1};
        int result = 6;

        FirstOddNumber firstOddNumber = new FirstOddNumber();

        Assert.assertEquals("One odd element", result, firstOddNumber.find(input));
    }
}