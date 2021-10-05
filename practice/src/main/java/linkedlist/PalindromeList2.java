package linkedlist;

import java.util.ArrayList;
import java.util.List;

import linkedlist.LinkedList.ListNode;

public class PalindromeList2 {
	// this function will work only if the len is > 1
	public static ListNode reverseList(ListNode B, int len) {
		ListNode cur, prev, next;
		cur = B;
		prev = null;
		next = null;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}

		// why prev is returned ?
		// because we are iterating over cur , and when cur got null the loop broke
		// so if we return cur , it means we are returning null , hence prev
		return prev;

	}

	public static int lPalin(ListNode A) {
		int res = 0;
		ListNode B, head, reversedNode;
		B = A;
		head = A;
		int len = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (head != null) {
			len++;
			// System.out.println(head.data);
			arr.add(head.val);
			head = head.next;
			
		}
		if (len > 1)
			B = reverseList(B, len);

		reversedNode = B;

		System.out.println("printing reversed list ");
		
		
		while (B != null) {
			System.out.println(B.val);
			
			B = B.next;
		}
		

		int checkLen = 0;
		checkLen = checkPalin(reversedNode, arr);
		System.out.println(checkLen);
		if(len %2 != 0)
			checkLen++;
		if (checkLen == len)
			res = 1;
		return res;
	}
	
	public static int checkPalin(ListNode reversedNode , List<Integer> arr) {
		int checkLen = 0;
		int i =0;
		while (reversedNode != null && i<arr.size()/2 && (reversedNode.val == arr.get(i))) {
			System.out.println(arr.get(i)+" --> "+reversedNode.val);
			checkLen+=2;
			reversedNode = reversedNode.next;
			i++;
		}
		
		return checkLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
	//	ll.insert(3);
		ll.insert(2);
		ll.insert(1);
		System.out.println(lPalin(ll.head));

	}

}
