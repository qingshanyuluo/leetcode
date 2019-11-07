package xyz.lennon.two;

public class S33 {

    public int search(int[] nums, int target) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
