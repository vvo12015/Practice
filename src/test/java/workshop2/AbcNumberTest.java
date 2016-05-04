package workshop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class AbcNumberTest {
    @Test
    public void convert() throws Exception {
        String input = "abcdef";
        int result = 123456;

        AbcNumber abcNumber = new AbcNumber();

        Assert.assertEquals("assert String and int", result, abcNumber.convert(input));
    }

}