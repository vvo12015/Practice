package workshop1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumberTest {

    @Test
    public void maxOneElement() throws Exception {

        int input[] = {1};
        int result = 1;

        FindMaxNumber findMaxNumber = new FindMaxNumber();

        Assert.assertEquals("One element in array", result, findMaxNumber.max(input));
    }

    @Test
    public void maxFewElement() throws Exception {

        int input[] = {1, 9000, 45};
        int result = 9000;

        FindMaxNumber findMaxNumber = new FindMaxNumber();

        Assert.assertEquals("Few element in array", result, findMaxNumber.max(input));
    }
}