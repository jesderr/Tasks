package easyTasks;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int answer = 0;
        for (int num : nums) {
            if (val != num) {
                answer++;
            }
        }
        return answer;
    }
}
