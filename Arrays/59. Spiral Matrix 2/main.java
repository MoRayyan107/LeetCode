// Time Complexity -> O(n^2), Space Complexity -> O(n)
class Solution {
    public int[][] generateMatrix(int n) {
        // square matrix since given input is only 1 'n'
        int[][] matrix = new int[n][n]; 
        int val = 1; // adding value from 1 -> n in the matrix

        int rowStart = 0;
        int rowEnd = matrix.length-1;

        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){

            // moving from L -> R (Top Row)
            for (int i = colStart; i <= colEnd; i++)
                matrix[rowStart][i] = val++;
            rowStart++;

            // moving from T -> B (Downwards)
            for (int i = rowStart; i <= rowEnd; i++)
                matrix[i][colEnd] = val++;
            colEnd--;

            // moving from R -> L (Bottom Row)
            if(rowStart <= rowEnd){
                for (int i = colEnd; i >= colStart; i--)
                    matrix[rowEnd][i] = val++;
                rowEnd--;
            }

            // moving from B -> T (Upwards)
            if(colStart <= colEnd){
                for (int i = rowEnd; i >= rowStart; i--)
                    matrix[i][colStart] = val++;
                colStart++;
            }

        } 

        return matrix; 
    }
}
