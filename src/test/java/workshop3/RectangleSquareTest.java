package workshop3;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.cglib.transform.AbstractClassFilterTransformer;

import static org.junit.Assert.*;

public class RectangleSquareTest {
    @Test
    public void testMeasureNormally() throws Exception {

        int[] x = {10, 0 , 50, 15, 30, 5};
        int[] h = {10, 5, 15, 20, 10, 5};
        int[] w = {5, 10, 30, 25, 10, 25};

        int result = 1050;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("for sort", result, rectangleSquare.measure(x, h, w));
    }

    @Test
    public void testMeasureAllInOne() throws Exception {

        int[] x = {10, 0 , 15, 5};
        int[] h = {10, 5, 20, 15};
        int[] w = {5, 40, 25,  5};

        int result = 650;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("for sort", result, rectangleSquare.measure(x, h, w));
    }


}