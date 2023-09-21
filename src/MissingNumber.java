public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 0 };

        System.out.println(missingNumber(arr));
    }

    static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length;) {
            if (nums[i] < nums.length && nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j)
                return j;
        }

        return nums.length;
    }
}