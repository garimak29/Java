/*
 * Remove Duplicates from Sorted List
Problem Description

Given a sorted linked list, delete all duplicates such that each element appear only once.



Problem Constraints
0 <= length of linked list <= 106



Input Format
First argument is the head pointer of the linked list.



Output Format
Return the head pointer of the linked list after removing all duplicates.



Example Input
Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output
Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation
Explanation 1:

 Each element appear only once in 1->2.
 * 
 * */
package linkedlist;

import linkedlist.LinkedList.ListNode;

public class RemoveDuplicatesFromList {
	public static ListNode deleteDuplicates(ListNode A) {
		ListNode head = A, cur = A, prev = A, next = cur.next, temp;
		while (cur != null && next != null) {
			if (cur.val == next.val) {
			//	System.out.println("cur->"+ cur.val+" --- > "+next.val);
				temp = cur.next;
				cur = null;
				prev.next = temp.next;
				cur = next;
				next = next.next;
			} else {
				if (prev != null && next != null) {
					prev = prev.next;
					cur = next;
					next = next.next;
				}
			}

			head = head.next;

		}
		A.printNodeList(A);
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll = new LinkedList<>();
		ll.insert(1);

		/*
		 * ll.insert(1); ll.insert(1); ll.insert(3);
		 */
		deleteDuplicates(ll.head);

	}

}
