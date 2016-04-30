package workshop1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSnakeTraversalTest {

    @Test
    public void testPrint3x3() throws Exception {

        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int result[] = {1, 4, 7, 8, 5, 2, 3, 6, 9};

        Assert.assertArrayEquals("Normally value, matrix 3x3", result, matrixSnakeTraversal.print(input));
    }

    @Test
    public void testPrint4x4() throws Exception {

        MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};

        int result[] = {1, 4, 7, 10, 11, 8, 5, 2, 3, 6, 9, 12};

        Assert.assertArrayEquals("Normally value, matrix 3x4", result, matrixSnakeTraversal.print(input));
    }

    }
