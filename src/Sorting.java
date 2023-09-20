import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,5};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap (int[] arr, int start, int end) {
        int tmp = arr[end];
        arr[end] = arr[start];
        arr[start] = tmp;
    }


    static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void bubble(int[] arr) {
        boolean swap;
        for(int i = 0; i < arr.length; i++) {
            swap = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j -1]){
                    int tmp = arr[j];
                    arr[j] = arr[j - 1]; 
                    arr[j -1] = tmp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
