import java.util.Arrays;

public class CyclicSort { 
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
     
        System.out.print(Arrays.toString(cyclicSort(arr)));
    }    

    static void swap (int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    static int[] cyclicSort(int[] arr ) {
        for(int i = 0; i < arr.length;) {
            if(arr[i] - 1 != i){
                swap(arr, arr[i] - 1, i); 
            } else {
                i++;    
            } 
        }

        return arr;
    }
}
