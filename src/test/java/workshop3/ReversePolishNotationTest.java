package workshop3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {
    @Test
    public void testEvaluate() throws Exception {
        String sings = "12 2 3 4 * 10 5 / + * +";

        int result = 40;

        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

        Assert.assertEquals("sum 40", result, reversePolishNotation.evaluate(sings));
    }

    @Test
    public void testEvaluateMinus() throws Exception {
        String sings = "17 2 -";

        int result = 15;

        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();

        Assert.assertEquals("sum 40", result, reversePolishNotation.evaluate(sings));
    }


}