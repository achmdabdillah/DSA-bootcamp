import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2 };
        int[] nums2 = { 1, 1 };
        int[] nums3 = { 3, 4, -1, 1 };
        int[] nums4 = { 2 };

        System.out.println(firstMissingPositive(nums2));
        // firstMissingPositive(nums3);
        // System.out.println(Arrays.toString(nums2));
    }

    static void swap(int[] nums, int start, int end) {
        int tmp = nums[start];
        nums[start] = nums[end];
        nums[end] = tmp;
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (correct != i && nums[correct] != nums[i]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }

        List<Integer> res = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                res.add(j + 1);
            }
        }

        return res;
    }

    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (correct != i && nums[correct] != nums[i]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    // 41. First Missing Positive

    // my version
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            System.out.println("-----------------------------------------------");
            System.out.println("correct       " + correct);
            System.out.println("i             " + i);
            System.out.println("nums[i]       " + nums[i]);
            System.out.println("nums[correct] " + nums[correct]);
            System.out.println("-----------------------------------------------");
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j)
                return j + 1;
        }

        return nums.length + 1;
    }

    // kunals version
    public static int firstMissingPositiveKunal(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1)
                return index + 1;
        }

        return arr.length + 1;
    }

}
