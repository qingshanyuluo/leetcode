package xyz.lennon.one;

import xyz.lennon.Main;

import java.util.HashMap;
import java.util.Map;

public class S3 {

    public static void main(String[] args) {
        S3 s3 = new S3();
        System.out.println(s3.lengthOfLongestSubstring("abcaert"));
    }


    public int lengthOfLongestSubstring(String s) {

        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j =-1; i < s.length(); i++) {

            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), i);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - j);

        }
        return res;

    }
}
