package workshop1;

public class MatrixTraversal {

    public int[] print(int[][] input) {

        int m = input.length;//row
        int n = input[0].length;//col
        int[] result = new int[n* m];
        int dx = 1;
        int dy = 0;
        int row = 0;
        int col = 0;
        int colMax = n;
        int rowMax = m;
        int colMin = 0;
        int rowMin = 0;

        for (int index = 0; index < n*m; index++) {

            result[index] = input[row][col];

            row += dy;
            col += dx;

            if ((col < colMin || col >= colMax) || (row < rowMin || row >= rowMax)){
                if (dx == 0){
                    dx = -dy;

                    if (dy > 0){

                        colMax--;

                    }else {

                        colMin--;
                    }

                    row -= dy;
                    col += dx;

                    dy = 0;
                }else{
                    dy = dx;

                    if (dx > 0){

                        rowMin++;

                    }else {

                        rowMax--;
                    }
                    col -= dx;
                    row += dy;

                    dx = 0;
                }
            }
        }
        return result;
    }
}
