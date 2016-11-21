package Mine;

/*
 *You are given two linked lists representing two non-negative numbers.
 *The digits are stored in reverse order and each of their nodes contain a single digit. 
 *Add the two numbers and return it as a linked list.
 *
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 * 
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class LeetCode02_AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		        ListNode head = new ListNode(0);
				ListNode current=head, n1 = l1, n2 = l2;
				
				int carry = 0;
				if(n1 == null && n2 == null) return null;
			
				while(n1 != null && n2 != null) {
					int val = 0;
					val = (n1.val + n2.val + carry)%10;
					
					if((n1.val + n2.val + carry) >= 10) {
						carry = 1;
					} else {
						carry = 0;
					}
					n1 = n1.next;
					n2 = n2.next;
					
					
					current.next = new ListNode(val);;
					current = current.next;
				}
				
				if(n1 == null) {
					while(n2 != null) {
						int val2 = 0;
						val2 = (n2.val + carry)%10;
						if((n2.val + carry) >= 10) {
							carry = 1;
						} else {
							carry = 0;
						}
						n2 = n2.next;
						ListNode newNode2 = new ListNode(val2);
						current.next = newNode2;
						current = current.next;
					}	
				}
				
				if(n2 == null) {
					while(n1 != null) {
						int val1 = 0;
						val1 = (n1.val + carry)%10;
						if((n1.val + carry) >= 10) {
							carry = 1;
						} else {
							carry = 0;
						}
						n1 = n1.next;
						ListNode newNode2 = new ListNode(val1);
						current.next = newNode2;
						current = current.next;
					}	
				}
				
				if(carry > 0) {
					current.next = new ListNode(carry);
				}
				
				return head.next;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(2);
		ListNode test = addTwoNumbers(l1,l2);
		while(test != null) {
			System.out.println("value: "+test.val);
			test = test.next;
			
		}
	}

}
