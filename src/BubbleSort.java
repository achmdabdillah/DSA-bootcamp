import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};

        bubble(arr);
        System.out.println(Arrays.toString(arr));
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
