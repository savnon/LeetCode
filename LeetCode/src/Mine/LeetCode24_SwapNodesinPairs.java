package Mine;

import java.util.List;

/**
 * Created by pewwang on 2016/11/28.
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 Subscribe to see which companies asked this question
 */
public class LeetCode24_SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head.next == null||head == null) return head;

        ListNode firstNode = new ListNode(0);
        firstNode.next = head;

        ListNode cur = head;
        ListNode prev = firstNode;

        ListNode nextKeep;
        while(cur != null && cur.next != null) {
            nextKeep = cur.next.next;
            cur.next.next= cur;
            prev.next = cur.next;
            cur.next = nextKeep;

            prev = cur;
            cur = cur.next;
        }
        return firstNode.next;
    }
}
