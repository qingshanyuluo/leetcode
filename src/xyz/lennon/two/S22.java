package xyz.lennon.two;

import java.util.ArrayList;
import java.util.List;

public class S22 {

    public static void main(String[] args) {
        S22 s22 = new S22();
        s22.generateParenthesis(3);
    }
//    public List<String> generateParenthesis(int n) {
//        List<String> res = new ArrayList<>();
//
//        Stack<Character> stack = new Stack<>();
//
//        StringBuilder s = new StringBuilder();
//
//        if (stack.empty()) {
//            s.append('(');
//            stack.push('(');
//        } else {
//            s.
//        }
//
//        return res;
//    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }



}
