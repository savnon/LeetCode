package Mine;

/**
 * Created by pewwang on 2016/11/24.
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 */
public class LeetCode21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            }    else {
                p.next = p2;
                p2 = p2.next;
            }
        }

        if(p1!= null){
            p.next = p1;
        }
        if(p2!=null) {
            p.next = p2;
        }
        return head.next;


    }

    public ListNode test(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        ListNode p1 = l1;
        ListNode p2 = l2;

        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
        }
        if(p1 != null) {
            p.next = p1;
        }
        if(p2 != null) {
            p.next = p2;
        }
        return head.next;


    }
}
