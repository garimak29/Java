/*
 * Swap List Nodes in pairs
Problem Description

Given a linked list A, swap every two adjacent nodes and return its head.

NOTE: Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.



Problem Constraints
1 <= |A| <= 106



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4
Input 2:

 A = 7 -> 2 -> 1


Example Output
Output 1:

 2 -> 1 -> 4 -> 3
Output 2:

 2 -> 7 -> 1


Example Explanation
Explanation 1:

 In the first example (1, 2) and (3, 4) are the adjacent nodes. Swapping them will result in 2 -> 1 -> 4 -> 3
Explanation 2:

 In the second example, 3rd element i.e. 1 does not have an adjacent node, so it won't be swapped. 



×

 * 
 * */package linkedlist;

import linkedlist.LinkedList.ListNode;

public class SwapNodesInPair {
	
	public static ListNode swapPairs(ListNode A) {
		ListNode head = A , temp = null  , start = A;
		while(start != null && start.next != null) {
			// 1>2 > 2>1
			/*normal swapping 
			 * temp = 1;
			 * 1= 2
			 * 2= temp
			 * 
			 * */
			head = head.next;
			temp = start.next;
			start.next = temp.next;
			temp.next = start;
			System.out.println(start.val+" -->"+ temp.val);
			start = start.next;
			
		}
		
		A.printNodeList(A);
		return A;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.insert(1);

		ll.insert(2);
		ll.insert(3);
		//ll.insert(4);
		swapPairs(ll.head);

	}

}
