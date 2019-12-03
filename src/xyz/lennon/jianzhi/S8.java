package xyz.lennon.jianzhi;

/**
 * S8
 */
public class S8 {

    public int JumpFloor(int target) {
        if (target == 0) {
            return 1;
        }
        if (target == 1) {
            return 1;
        }
        return JumpFloor(target-1) + JumpFloor(target - 2);
    }
}