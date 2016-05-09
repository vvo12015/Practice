package workshop3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnixPathTest {
    @Test
    public void testSimplify() throws Exception {

        String input = "/home/../var/./lib//file.txt";
        String result = "/var/lib/file.txt";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }

    @Test
    public void testSimplifyDotSlash() throws Exception {

        String input = "/.";
        String result = "/";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }

    @Test
    public void testSimplifyThree() throws Exception {

        String input = "/var//lib";
        String result = "/var/lib";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }

    @Test
    public void testSimplifyDoubleSlash() throws Exception {

        String input = "//";
        String result = "/";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }

    @Test
    public void testSimplifyDifficult() throws Exception {

        String input = "/var/lib/../log/./../tmp/data///.";
        String result = "/var/tmp/data";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }

     @Test
    public void testSimplifyNormally() throws Exception {

        String input = "/var//.///../lib/";
        String result = "/lib";

        UnixPath unixPath = new UnixPath();

        Assert.assertEquals("normally value", result, unixPath.simplify(input));
    }



}