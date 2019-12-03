package xyz.lennon.jianzhi;

/**
 * S6
 */
public class S6 {

    public int minNumberInRotateArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        int target = (left + right)/2;
        int end = array[right];
        while ((right - left) > 2) {
            if (array[target] <= end) {
                right = target;
                target = (left + right)/2;
            } else {
                left = target;
                target = (left + right)/2;
            }
        }
        return Math.min(array[target], array[right]);
    }

}