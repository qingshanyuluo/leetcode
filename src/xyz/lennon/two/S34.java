package xyz.lennon.two;

public class S34 {

    public static void main(String[] args) {
        S34 s34 = new S34();
        s34.searchRange(new int[]{1,4}, 4);
    }
/*    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                start = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] == target) {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }*/

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};
        int start = -1;
        int end = -1;
        int left = 0;
        int right = nums.length;
        int mid = (left+right)/2;
        while (nums[mid] != target&&(right-left)>1) {
            if (nums[mid] < target) {
                left = mid;
                mid = (left+right)/2;
            } else {
                right = mid;
                mid = (left+right)/2;
            }
        }
//        while ()
        if (nums[mid] == target) {
            start =  mid;
            while (start>-1&&nums[start] == target) {
                start--;
            }
            start++;
            end = mid;
            while (end < nums.length&&nums[end] == target) {
                end++;
            }
            end--;
        }

        return new int[]{start, end};

    }


}
