package code2;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/6/9 - 15:36
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Solution {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(0);
//        ListNode n2 = new ListNode(4);
//        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(0);
//        ListNode n5 = new ListNode(6);
//        ListNode n6 = new ListNode(4);
//        n1.next = n2;
//        n2.next = n3;
//        n4.next = n5;
//        n5.next = n6;
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(n1, n4);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//        ListNode cur1 = l1;
//        ListNode cur2 = l2;
//        while (cur1 != null) {
//            stack1.push(cur1.val);
//            cur1 = cur1.next;
//        }
//        while (cur2 != null) {
//            stack2.push(cur2.val);
//            cur2 = cur2.next;
//        }
//
//        if (stack1.peek() == 0){
//            return l2;
//        }
//        if (stack2.peek() == 0){
//            return l1;
//        }
//
//        int len1 = stack1.size();
//        int len2 = stack2.size();
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < len1; i++) {
//            num1 += stack1.pop() * (int)Math.pow(10, len1 - stack1.size() -1);
//        }
//        for (int i = 0; i < len2; i++) {
//            num2 += stack2.pop() * (int)Math.pow(10, len2 - stack2.size() -1);
//        }
//        int n = num1 + num2;
//        System.out.println(n);
//        ListNode head = new ListNode(0);
//        ListNode cur = head;
//        while (n != 0) {
//            ListNode res = new ListNode(n % 10);
//            cur.next = res;
//            cur = cur.next;
//            n = n / 10;
//        }
//        return head.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}