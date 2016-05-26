package workshop5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KmpSubMoveTest {
    @Test
    public void subMoveQuantity() throws Exception {
        String input = "aderd";
        String nextInput = "rdade";
        int result = 2;

        KmpSubMove kmpSubMove = new KmpSubMove();

        Assert.assertEquals("result 2", result, kmpSubMove.subMoveQuantity(input, nextInput));
    }
    @Test
    public void subMoveQuantityBrrr() throws Exception {
        String input = "abracadabra";
        String nextInput = "racadabraab";
        int result = 9;

        KmpSubMove kmpSubMove = new KmpSubMove();

        Assert.assertEquals("result 2", result, kmpSubMove.subMoveQuantity(input, nextInput));
    }

}