package workshop3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleSquareTest {
    @Test
    public void testMeasureDifferentX_AllRectangle() throws Exception {
        int[] x = {0, 20, 40, 60, 80};
        int[] h = {10, 10, 10, 10, 10};
        int[] w = {10, 10, 10, 10, 10};

        int result = 500;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("different x", result, rectangleSquare.measure(x,h, w));
    }

    @Test
    public void testMeasureDifferent100() throws Exception {
        int[] x = {0, 10};
        int[] h = {10, 10};
        int[] w = {10, 10};

        int result = 200;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("2x100", result, rectangleSquare.measure(x,h, w));
    }

    @Test
    public void testMeasureEquals_AllRectangle() throws Exception {
        int[] x = {0, 0, 0, 0, 0};
        int[] h = {10, 10, 10, 10, 10};
        int[] w = {10, 10, 10, 10, 10};

        int result = 100;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("equals rectangle", result, rectangleSquare.measure(x,h, w));
    }



    @Test
    public void testMeasureDifferent_AllRectangle() throws Exception {

        int[] x = {0, 10, 30};
        int[] h = {20, 10, 20};
        int[] w = {20, 30, 20};

        int result = 900;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("", result, rectangleSquare.measure(x,h, w));
    }

    @Test
    public void testMeasureDifferentFiveRectangle() throws Exception {

        int[] x = {0, 10, 20, 20, 30};
        int[] h = {10, 20, 30, 10, 20};
        int[] w = {60, 40, 10, 20, 10};

        int result = 1100;

        RectangleSquare rectangleSquare = new RectangleSquare();

        Assert.assertEquals("", result, rectangleSquare.measure(x,h, w));
    }
}