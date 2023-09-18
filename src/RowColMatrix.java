import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 55)));
    }

    static int[] search (int[][] matrix, int target) {
//        Row always start from 0
        int row = 0;
//        Column always start from the last col
        int column = matrix.length - 1;

        while(row < matrix.length - 1 && column >= 0) {
            if(matrix[row][column] == target) {
                return new int[]{row, column};
            } else if(matrix[row][column] > target) {
                column--;
            } else {
                row ++;
            }
        }
    return new int[]{-1, -1 };
    }
}
