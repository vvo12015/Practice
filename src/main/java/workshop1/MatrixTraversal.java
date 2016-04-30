package workshop1;

public class MatrixTraversal {

    public int[] print(int[][] input) {

        int n = input.length;//col
        int m = input[0].length;//row
        int[] result = new int[n* m];
        int dx = 1;
        int dy = 0;
        int row = 0;
        int col = 0;
        int colMax = n;
        int rowMax = m;

        for (int index = 0; index < n*m; index++) {

            result[index] = input[row][col];

            row += dy;
            col += dx;

            if ((col <0 || col >= colMax) || (row < 0 || row >= rowMax)){
                if (dx == 0){
                    dx = -dy;
                    row -= dy;
                    rowMax--;
                }else{
                    dy = dx;
                    col -= dx;
                    dx = 0;
                    colMax--;
                }
            }
        }
        return result;
    }
}
