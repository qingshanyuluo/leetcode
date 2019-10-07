package xyz.lennon.one;

public class S11 {

    public static void main(String[] args) {

        S11 s11 = new S11();
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(s11.maxArea(height));

    }

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int max = 0;

        while (start < end) {
            if (height[start] < height[end]) {
                int o = height[start];
                max = Math.max(max, (end - start) * o);
                start++;
            } else  {
                int o = height[end];
                max = Math.max(max, (end - start) * o);
                end--;
            }
        }

        return max;

    }
}
