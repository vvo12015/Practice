package workshop2;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.ServerRequestInfo;

import static org.junit.Assert.*;

public class AddBinaryTest {
    @Test
    public void add() throws Exception {
        String inputA = "101";
        String inputB = "100";

        String result = "1001";

        AddBinary addBinary = new AddBinary();

        Assert.assertEquals("normally values", result, addBinary.add(inputA, inputB));
    }

}