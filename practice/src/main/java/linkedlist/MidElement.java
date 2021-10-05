/*
 * Middle element of linked list
Problem Description

Given a linked list of integers. Find and return the middle element of the linked list.

NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.



Problem Constraints
1 <= length of the linked list <= 100000

1 <= Node value <= 109



Input Format
The only argument given head pointer of linked list.



Output Format
Return the middle element of the linked list.



Example Input
Input 1:

 1 -> 2 -> 3 -> 4 -> 5
Input 2:

 1 -> 5 -> 6 -> 2 -> 3 -> 4


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 The middle element is 3.
Explanation 2:

 The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.

 * 
 * */
package linkedlist;

import linkedlist.LinkedList.ListNode;

public class MidElement {

	public static int solve(ListNode A) {
		ListNode fast = A, slow = A;
		int len = 0;
		while (fast!= null && fast.next != null) {
			fast = fast.next.next;
			len = len + 2;
			slow = slow.next;
		}
		// why len+1 , coz fast.next is ignored due to while loop condition
		len = len + 1;
		if (A == null)
			len = 0;

		System.out.println(len);
		return slow.val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);

		ll.insert(2);
		ll.insert(3);
		//ll.insert(4);

		System.out.println(solve(ll.head));

	}

}
