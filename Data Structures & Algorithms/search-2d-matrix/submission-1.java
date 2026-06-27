class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
        List<Integer>ls=new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target &&target <= matrix[i][matrix[0].length - 1]){
                for (int j = 0; j < matrix[0].length; j++) {
                    ls.add(matrix[i][j]);
                }
                break;
            }
        }

        if (ls.contains(target))return true;
        return false;
    }
}
