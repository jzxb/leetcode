package code24;

/**
 * @author lhx
 * @date 2019/5/14 - 15:07
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * <p>
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
//        while (null != head){
//            ListNode next = head.next;
//            head.next.next = head;
//            head.next = next.next;
//        }
//        return head;
        if(head == null || head.next == null){
            return head;
        }
        ListNode lHead = new ListNode(-1);
        lHead.next = head;
        ListNode pre = lHead;
        while(pre.next != null && pre.next.next != null){
            ListNode cur = pre.next;
            ListNode next = pre.next.next;
            cur.next = next.next;
            next.next = cur;
            pre.next = next;
            pre = cur;
        }
        return lHead.next;

//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode next = head.next;
//        head.next = swapPairs(next.next);
//        next.next = head;
//        return next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
