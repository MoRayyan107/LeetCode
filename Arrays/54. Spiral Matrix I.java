// Time complexity -> O(n), Space Complexity -> O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // create a list of integer to store the result
        List<Integer> res = new ArrayList<>();

        // ponter to start of row index
        int rowStart = 0;

        // pointer to end of row index 
        int rowEnd = matrix.length - 1;

        // pointer to start of column index
        int colStart = 0;

        // pointer to the End of column index
        int colEnd = matrix[0].length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            // moving from Left to Right 
            for (int i = colStart; i <= colEnd; i++)
                res.add(matrix[rowStart][i]);
            rowStart++;

            // moving from top to bottom
            for (int i = rowStart; i <= rowEnd; i++)
                res.add(matrix[i][colEnd]);
            colEnd--;

            // moving from Right to left (at bottom)
            if (rowStart <= rowEnd){
                for (int i = colEnd; i >= colStart; i--)
                    res.add(matrix[rowEnd][i]);
                rowEnd--;
            }

            // moving from bottom to top
            if (colStart <= colEnd){
                for (int i = rowEnd; i >= rowStart; i--)
                    res.add(matrix[i][colStart]);
                colStart++;
            }
        }

        return res;
    }
}
