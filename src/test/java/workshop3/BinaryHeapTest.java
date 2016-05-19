package workshop3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryHeapTest {

    public static final int heapSize = 2;

    @Test
    public void insert1() throws Exception {


    }

    @Test
    public void poll1() throws Exception {
        BinaryHeap binaryHeap = new BinaryHeap(100);

        int[] result = new int[100];

        for (int i = 0; i < 100; i++) {
            binaryHeap.insert(i);
            result[99 - i] = i;
        }

        int[] forAssert = new int[100];

        for (int i = 0; i < 100; i++) {
            forAssert[i] = binaryHeap.poll();
            System.out.println(forAssert[i]);
        }

        Assert.assertArrayEquals("test from codegym", result, forAssert);
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void poll() throws Exception {

    }

}