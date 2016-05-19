package workshop3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeFoodTest {
    @Test
    public void find() throws Exception {
        int[] gnomas = {5, 7, 6, 9, 4};
        int[] portion = {8, 5, 6, 2, 3};

        int[] result = {4, 2, 1, 0, 3};

        GnomeFood gnomeFood = new GnomeFood();

        Assert.assertArrayEquals("Normally values", result, gnomeFood.find(gnomas, portion));
    }

}