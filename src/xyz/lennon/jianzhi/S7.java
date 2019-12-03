package xyz.lennon.jianzhi;

/**
 * S7
 */
public class S7 {

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int result = 2;
        int f = 1;
        int l = 1;
        for (int i = 0; i < (n-3); i++) {
            f = l;
            l = result;
            result = f + l;
        }
        return result;
    }

}