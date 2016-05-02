package workshop1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTraversalTest {
    @Test
    public void print() throws Exception {

        MatrixTraversal matrixTraversal = new MatrixTraversal();

        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[] result = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};

        for (int i = 0; i < matrixTraversal.print(input).length; i++) {
            System.out.print(matrixTraversal.print(input)[i] + ", ");
        }
        Assert.assertArrayEquals("traversal 4x4", result, matrixTraversal.print(input));
    }

    @Test
    public void print3x4() throws Exception {

        MatrixTraversal matrixTraversal = new MatrixTraversal();

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };
        int[] result = {1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8};

        for (int i = 0; i < matrixTraversal.print(input).length; i++) {
            System.out.print(matrixTraversal.print(input)[i] + ", ");
        }
        Assert.assertArrayEquals("traversal 4x4", result, matrixTraversal.print(input));
    }
}