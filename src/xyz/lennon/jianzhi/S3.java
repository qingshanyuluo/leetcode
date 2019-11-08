package xyz.lennon.jianzhi;

import xyz.lennon.ListNode;

import java.util.ArrayList;

public class S3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i > -1; i--) {
            res.add(list.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("fdss");
    }
}
