package mediumTasks;

import java.util.Arrays;

public class Search2Dmatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int curRow = 0;
        int curCol = matrix[0].length-1;

        while(curRow < matrix.length && curCol >= 0){
            if(matrix[curRow][curCol] == target){
                return true;
            }else if(matrix[curRow][curCol] > target){
                curCol--;
            }else{
                curRow++;
            }
        }

        return false;
    }
}
