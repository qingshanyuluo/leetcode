package xyz.lennon.jianzhi;

/**
 * S10
 */
public class S10 {

    public int RectCover(int target) {
        if ( target < 1)
            return 0;
        int g = 1, f = 2;
        while (--target>0) {
            f = f + g;
            g = f - g;
        }
        return g;
    }

    public static void main(String[] args) {
        S10 s10 = new S10();
        s10.RectCover(5);
    }
}