package code19;

/**
 * @author lhx
 * @date 2019/6/9 - 21:00
 * <p>
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = new ListNode(0);
        cur.next = head;
        int length = 0;
        ListNode first = head;
        while (first != null){
            length++;
            first = first.next;
        }
        first = cur;
        for (int i = 0; i < length - n; i++) {
            first = first.next;
        }
        first.next = first.next.next;
        return cur.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
