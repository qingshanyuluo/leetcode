package xyz.lennon.one;

public class S5 {

    public static void main(String[] args) {

        S5 s5 = new S5();

        System.out.println(s5.expand("assarwe", 2));
        System.out.println(s5.longestPalindrome("asesa434"));

    }

    public String longestPalindrome(String s) {
        if (s.length() == 0) return "";
        int loc1 = 0;
        int loc2 = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < s.length(); i++) {
            int re = expand(s, i);
            if (re > max1) {
                max1 = re;
                loc1 = i;
            }
            re = expand(s, i , i + 1);
            if (re > max2) {
                max2 = re;
                loc2 = i;
            }
        }

        if ((max1 << 1) > (max2 << 1) + 1) {
            return s.substring(loc1 - max1 + 1, loc1 + max1);
        } else {
            return s.substring(loc2 - max2 + 1, loc2 + max2 + 1);
        }

    }

    private int expand(String s, int index) {
        int i = 1;
        while (index + i < s.length() && index - i > -1) {
            if (s.charAt(index + i) == s.charAt(index - i)) {
                i++;
            } else {
                return i;
            }
        }
        return i;
    }
    private int expand(String s, int h, int e) {
        int i = 0;
        while (e + i < s.length() && h - i > -1) {
            if (s.charAt(e + i) == s.charAt(h - i)) {
                i++;
            } else {
                return i;
            }
        }
        return i;
    }

}
