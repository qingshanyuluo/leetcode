package xyz.lennon.two;

public class S70 {

    public static void main(String[] args) {
        System.out.println(papa(5));
    }

    public static int papa(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return papa(n - 1) + papa(n - 2);
    }
}
