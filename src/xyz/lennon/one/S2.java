package xyz.lennon.one;

import xyz.lennon.Main;

public class S2 {

    public static void main(String[] args) {


        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        S2 solution = new S2();
        ListNode res =
        solution.addTwoNumbers(l1, l2);
        System.out.println(res);
    }


    ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res;

        boolean iscarry = false;
        int sum = l1.val + l2.val;
        if (sum > 9) {
            iscarry = true;
            sum -= 10;
        } else {
            iscarry = false;
        }

        ListNode l3 = new ListNode(sum);
        res = l3;

        //l3 = l3.next;
        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null || l2 != null) {

            if (l1 == null) {
                sum = l2.val;
            } else if (l2 == null) {
                sum = l1.val;
            } else {
                sum = l1.val + l2.val;
            }
//            l1.val = 0;
//            l2.val = 0;

            if (iscarry) {
                sum += 1;
            }

            if (sum > 9) {
                iscarry = true;
                sum -= 10;
            } else {
                iscarry = false;
            }

            l3.next = new ListNode(sum);
            l3 = l3.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (iscarry) {
            l3.next = new ListNode(1);
        }
        return res;
    }
}



class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
