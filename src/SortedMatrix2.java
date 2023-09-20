import java.util.Arrays;

public class SortedMatrix2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,  4,  7,  11, 15},
            {2,  5,  8,  12, 19},
            {3,  6,  9,  16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };

        System.out.println(Arrays.toString(searchMatrix(arr, 6)));
        
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        // start from bottom left
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) {
                row--;
            }
            else if (matrix[row][col] < target) {
                col++;
            }
            else {
                return new int[] {row, col};
            }
        }
        return new int[] {-1, -1};
    }
}
