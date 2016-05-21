package workshop4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vvo12 on 21.05.2016.
 */
public class ColorChainTest {
    @Test
    public void count() throws Exception {
        int input = 3;
        int result = 4;

        ColorChain colorChain = new ColorChain();
        Assert.assertEquals("3", result, colorChain.count(3));
    }

    @Test
    public void testCount() throws Exception {
        int input = 4;
        int result = 7;

        ColorChain colorChain = new ColorChain();
        Assert.assertEquals("4", result, colorChain.count(input));
    }
}