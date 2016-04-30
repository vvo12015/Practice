package workshop1;

public class MatrixSnakeTraversal {

    public int[] print(int[][] input) {

        int length = input.length * input[0].length;

        int[] result = new int[length];

        int startBorder = 0;
        int endBorder = input[0].length;
        int index = 0;
        int direction = 1;
        int j = 0;

        for (int i = 0; i < input[0].length; i++) {
            while (j >= 0 && j < input.length){

                result[index] = input[j][i];

                index++;

                j += direction;
            }

            direction = -1 * direction;

            j += direction;
        }

        return result;
    }
}
