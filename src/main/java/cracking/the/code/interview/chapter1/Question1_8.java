package cracking.the.code.interview.chapter1;

public class Question1_8 {

    //Zero Matrix: Write an algorithm such that if an element in a M x N matrix is 0, 
    //its entire row and column are set to zero.
    public static void zeroMatrix(int[][] matrix) {

        //if [0][0] == 0 then set 0 in [0][1], [0][1], [0][2] and [1][0]
        // int[][] matrix = {
        //     new int[]{0,2,3},
        //     new int[]{4,5,6}
        // };

        int rows = matrix.length;
        int columns = matrix[0].length;

        //I could go through each index and if found a zero O(n^2), we would have another loop to set zero in rows and columns O(n^4)
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         if (matrix[i][j] == 0) {
        //             for (int k = 0; k < columns; k++) {
        //                 matrix[i][k] = 0;
        //                 for (int l = 0; l < rows; l++) {
        //                     matrix[l][i] = 0;
        //                 }
        //             }
        //             return matrix[i][j];
        //         }
        //     }
        // }

        //let's try to eliminate the nested loops and get a better time complexity
        //we can identify which positions the zeros are and put them on a list - the time complexity is decreased and the
        //space complexity is increased
        boolean[] rowsToSetZero = new boolean[matrix.length];
        boolean[] columnsToSetZero = new boolean[matrix[0].length];

        int[][] newMatrix = new int[rows][columns];

        //O(n^2)
        //Identifying the rows and columns should be zero. If the matrix position is zero, set true in the array in the same position.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    rowsToSetZero[i] = true;
                    columnsToSetZero[j] = true;
                } 
            }
        }

        //New empty matrix and will fill with values from the input matrix besides the true positions from the Arrays.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (rowsToSetZero[i] == false && columnsToSetZero[j] == false) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }
    }
}
