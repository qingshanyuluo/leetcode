package xyz.lennon.three;

import java.util.*;

public class S39 {

    public static void main(String[] args) {
        S39 s39 = new S39();
        List<List<Integer>> res = s39.combinationSum(new int[]{2, 3, 5}, 8);
        int[] dd = Arrays.copyOfRange(new int[]{2, 3, 5}, 1, 3);
        System.out.println(dd);
        System.out.println(res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (target < i) {
                break;
            }
            if (i==target) {
                List<Integer> integers = new ArrayList<>();
                integers.add(i);
                res.add(integers);
                break;
            }
            List<List<Integer>> c = combinationSum(/*Arrays.copyOfRange(candidates,1,candidates.length)*/candidates,target - i);
            for (List<Integer> integers: c){
                integers.add(i);
                res.addAll(c);
            }
        }

        return res;
    }
}
