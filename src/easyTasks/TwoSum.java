package easyTasks;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j-1] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
