package cracking.the.code.interview.chapter1;

public class Question1_7 {

    //Rotate Matrix: Given an image represented by an N x N matrix, where each pixel in the image is represented by an integer, 
    //write a method to rotate the image by 90 degrees. Can you do this in place?
    public static boolean rotateMatrix() {

        //[0][0] -> [2][0]
        //[0][1] -> [1][0]
        //[0][2] -> [0][0]
        //[1][0] -> [2][1]
        //[1][1] -> [1][1]
        //[1][2] -> [0][1]
        //[2][0] -> [2][2]
        //[2][1] -> [1][2]
        //[2][2] -> [0][2]
        int[][] m = {
            new int[]{1,2,3},
            new int[]{4,5,6},
            new int[]{7,8,9}
        };

        if (m.length == 0 || m.length != m[0].length) return false;

        int rows = m.length;
        int columns = m[0].length;

        int newRow = rows - 1;

        int[][] rm = new int[rows][columns];

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                rm[newRow][j] = m[j][i];
                newRow--;
            }
            newRow = rows - 1;
        }
        
       return true;
    }
}
