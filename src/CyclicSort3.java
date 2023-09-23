import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort3 {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2 };
        int[] nums2 = { 1, 1 };

        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(nums));
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
                return new int[] { nums[j], j+1 };
            }
        }

        return new int[] { -1, -1 };
    }

}
