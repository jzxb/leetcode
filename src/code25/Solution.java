package code25;

/**
 * @author lhx
 * @date 2019/5/14 - 16:20
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        int count = 0;
        while (cur != null && count != k){
            cur = cur.next;
            count++;
        }
        if (count == k){
            cur = reverseKGroup(cur,k);
            while (count > 0){
                ListNode temp = head.next;
                head.next = cur;
                cur = head;
                head = temp;
                count--;
            }
            head = cur;
        }
        return head;
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
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
