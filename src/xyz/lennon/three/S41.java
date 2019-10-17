package xyz.lennon.three;

import java.util.Arrays;

public class S41 {

//    public int firstMissingPositive(int[] nums) {
//        boolean[] v = new boolean[1000];
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= 0 && nums[i] <= 1000) {
//                v[nums[i]] = true;
//            }
//        }
//        for (int i = 1; i < v.length; i++) {
//            if (v[i] == false) {
//                return i;
//            }
//        }
//        return -1;
//    }
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==result)
                result++;
        }
        return result;
    }
}
