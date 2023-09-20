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
        // start from top right
        int row = 0;
        int col = matrix[0].length - 1;
        while (col >= 0 && row < matrix[0].length) {
            if (matrix[row][col] > target) {
                col--;
            }
            else if (matrix[row][col] < target) {
                row++;
            }
            else {
                return new int[] {row, col};
            }
        }
        return new int[] {-1, -1};
    }
}
