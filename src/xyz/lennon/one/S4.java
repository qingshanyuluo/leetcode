package xyz.lennon.one;

public class S4 {

    public static void main(String[] args) {
        int[] a = {1, 3};
        int[] b = {};
        S4 s4 = new S4();
        s4.findMedianSortedArrays(a, b);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        int[] target = new int[sum];

        int a = 0, b = 0, i = 0;
        while (i < sum && a < nums1.length && b < nums2.length) {
            if (nums1[a] < nums2[b]) {
                target[i] = nums1[a];
                    a++;
            } else {
                target[i] = nums2[b];
                    b++;
            }
            i++;
        }
        while (a < nums1.length) {
            target[i] = nums1[a];
            a++;
            i++;
        }
        while (b < nums2.length) {
            target[i] = nums2[b];
            b++;
            i++;
        }


        int res = target[(sum >> 1)] + target[(sum - 1) >> 1];
        return (double) res/2;
    }
}
