package workshop2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumberBase36Test {
    @Test
    public void testAddDigits() throws Exception {
        String inputA = "11111";
        String inputB = "22222";
        String result = "33333";

        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add(inputA, inputB));

        Assert.assertEquals("11111 + 22222", result, addNumberBase36.add(inputA, inputB));
    }

    @Test
    public void testAddLiters() throws Exception {
        String inputA = "aaaaa";
        String inputB = "bbbbb";
        String result = "lllll";

        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add(inputA, inputB));

        Assert.assertEquals("aaaaa + bbbbb", result, addNumberBase36.add(inputA, inputB));
    }

@Test
    public void testAddPlus1() throws Exception {
        String inputA = "1";
        String inputB = "zzzzz";
        String result = "100000";

        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add(inputA, inputB));

        Assert.assertEquals("1 + zzzzz", result, addNumberBase36.add(inputA, inputB));
    }

@Test
    public void testAddMax() throws Exception {
        String inputA = "zzzzz";
        String inputB = "zzzzz";
        String result = "1zzzzy";

        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add(inputA, inputB));

        Assert.assertEquals("zzzzz + zzzzz", result, addNumberBase36.add(inputA, inputB));
    }

    @Test
    public void testAddAplus1() throws Exception {
        String inputA = "A";
        String inputB = "1";
        String result = "b";

        AddNumberBase36 addNumberBase36 = new AddNumberBase36();
        System.out.println(addNumberBase36.add(inputA, inputB));

        Assert.assertEquals("a + 1", result, addNumberBase36.add(inputA, inputB));
    }

}