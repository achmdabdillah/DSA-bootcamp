import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1}
        };
        System.out.println(Arrays.toString(searchMatrix(arr, 1)));
    }

    public static int[] searchMatrix(int[][] matrix, int target) {
        // Base condition...
        // If it's a null matrix, return false....
        if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return new int[] {-1, -1};
        int row = matrix.length;        // Number of Rows of the matrix...
        int col = matrix[0].length;     // Number of Columns of the matrix...
        // Initialize rStart index of the considered 1D matrix (i.e: 0)...
        int rStart = 0;
        // Set rEnd index of the considered 1D matrix (i.e:(row*col)-1)...
        int rEnd = row * col - 1;
        // Now apply binary search & Run a while loop...
        while(rStart <= rEnd ){
            // Get the middle index as (rStart + rEnd) / 2...
            int mid = rStart + (rEnd - rStart)/2;
            // Set the element at middle index using matrix[mid / col][mid % col]...


            int midElement = matrix[mid / col][mid % col];
            // If the element present at the middle index is equal to the target integer, return true...
            if(midElement == target){
                // System.out.print(mid / col + " , " + (int) mid % col +"      ");
                return new int[] {mid/col, mid % col};   
            }
            // If the middle index is greater than the target, update the rEnd index to mid - 1...
            if(midElement > target){
                rEnd = mid-1;
            }
            // If the middle index element is lesser than the target, update the low index to middle+1...
            else{
                rStart = mid + 1;
            }
        }
        return new int[] {-1, -1};       // As we didn't get the target, we can directly return false...
    }
}
