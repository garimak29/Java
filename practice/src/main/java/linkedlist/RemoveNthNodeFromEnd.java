/*
 * Remove Nth Node from List End
Problem Description

Given a linked list A, remove the B-th node from the end of list and return its head.

For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes 1->2->3->5.

NOTE: If B is greater than the size of the list, remove the first node of the list.

NOTE: Try doing it using constant additional space.



Problem Constraints
1 <= |A| <= 106



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second argument of input contains the integer B.



Output Format
Return the head of the linked list after deleting the B-th element from the end.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 2
Input 2:

A = [1]
B = 1


Example Output
Output 1:

[1, 2, 3, 5]
Output 2:

 [] 


Example Explanation
Explanation 1:

In the first example, 4 is the second last element.
Explanation 2:

In the second example, 1 is the first and the last element.



×
You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details.

See
 * 
 * */

package linkedlist;

import linkedlist.LinkedList.ListNode;

public class RemoveNthNodeFromEnd {

	public static ListNode removeNthFromEnd(ListNode A, int B) {
		// nth node from end
		// len - n +1
		ListNode head = A, start = A;
		int len = 0;
		// length
		while (head != null) {
			len++;
			head = head.next;
		}
		System.out.println(len);

		// traverse till nth from end point
		int j = len - B - 1;

		while (j > 0) {
			j--;
			System.out.println("Current data " + A.val);
			start = start.next;

		}
		// remove the node;

		// 1>2>3>4>5
		// remove 4

		// 3>5
		if (j < 0)
			A = A.next;  // remove first element
		else
			removeNode(start);
		A.printNodeList(A);

		return A;
	}

	public static void removeNode(ListNode A) {
		ListNode temp;
		if (A != null ) {
			System.out.println("Current data " + A.val);
			temp = A.next;
			A.next = null;
			A.next = temp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		/*
		 * ll.insert(20); ll.insert(380); ll.insert(349); ll.insert(322);
		 * ll.insert(389); ll.insert(424); ll.insert(429); ll.insert(120);
		 * ll.insert(64); ll.insert(691); ll.insert(677); ll.insert(58); ll.insert(327);
		 * ll.insert(631); ll.insert(916); ll.insert(203); ll.insert(484);
		 * ll.insert(918); ll.insert(596); ll.insert(252); ll.insert(509);
		 * ll.insert(644); ll.insert(33); ll.insert(460);
		 */

		ll.insert(1);
		ll.insert(2);
		

		ll.insert(3);
		ll.insert(4);
		ll.insert(5);

		removeNthFromEnd(ll.head, 2);

	}

}
