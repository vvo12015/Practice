package workshop2;

import org.junit.Assert;
import org.junit.Test;
import workshop2.AverageNumber;

public class AverageNumberTest {
    @Test
    public void testAverage() throws Exception {

        int a = 1073741824;
        int b = - 1073741824;

        int result = 0;

        AverageNumber averageNumber = new AverageNumber();

        Assert.assertEquals("average between numbers 1073741824 and -1073741824", result,
                averageNumber.average(a, b));
    }

}