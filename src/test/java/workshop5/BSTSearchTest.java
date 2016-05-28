package workshop5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTSearchTest {

    static public TreeNode one, two, third, four, five, six, seven, eight, nine, ten, fifteen, sixteen, seventeen,
    eighteen, nineteen, twenty;
    ;

    @Before
    public void setUp() throws Exception {
        one = new TreeNode(1, null, null);
        six = new TreeNode(6, null, null);
        four = new TreeNode(4, null, null);
        eight = new TreeNode(8, null, null);
        seventeen = new TreeNode(17, null, null);
        third = new TreeNode(3, null, four);
        two = new TreeNode(2, one, third);
        seven = new TreeNode(7, six, nine);
        five = new TreeNode(5, two, seven);
        nine = new TreeNode(9, eight, null);
        eighteen = new TreeNode(18, seventeen, null);
        sixteen = new TreeNode(16, null, eighteen);
        nineteen = new TreeNode(19, sixteen, null);
        twenty = new TreeNode(20, nineteen, null);
        fifteen = new TreeNode(15, null, twenty);
        ten = new TreeNode(10, five, fifteen);

    }

    @Test
    public void testExistNight() throws Exception {

        int input = 9;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 9", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistTwo() throws Exception {

        int input = 2;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 2", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistSeven() throws Exception {

        int input = 7;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 7", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistFour() throws Exception {

        int input = 4;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 4", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistSeventeen() throws Exception {

        int input = 17;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 17", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistTwenty() throws Exception {

        int input = 20;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 20", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistEight() throws Exception {

        int input = 8;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 8", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistSex() throws Exception {

        int input = 6;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 6", result, bstSearch.exist(ten, input));
    }


    @Test
    public void testExistOne() throws Exception {

        int input = 1;
        boolean result = true;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 1", result, bstSearch.exist(ten, input));
    }

    @Test
    public void testExistHundred() throws Exception {

        int input = 100;
        boolean result = false;

        BSTSearch bstSearch = new BSTSearch();

        Assert.assertEquals("value = 100", result, bstSearch.exist(ten, input));
    }
}