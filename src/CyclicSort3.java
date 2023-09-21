import java.util.ArrayList;
import java.util.List;

public class CyclicSort3 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(findDisappearedNumbers(nums));
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
}
