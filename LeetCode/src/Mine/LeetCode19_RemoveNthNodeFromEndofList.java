package Mine;

/**
 * Created by pewwang on 2016/11/24.
 */
/**
 * Definition for singly-linked list.
/
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class LeetCode19_RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i < n ; i ++) {
            fast = fast.next;
        }
        //if remove the first node
        if(fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;


        return head;
    }
}
