class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] res = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res[i][j] = image[i][cols - 1 - j] ^ 1;
            }
        }

        return res;
    }
}