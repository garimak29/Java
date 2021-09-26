package linkedlist;

import linkedlist.LinkedList.Node;

public class PalindromeList2 {
	// this function will work only if the len is > 1
	public static Node reverseList(Node B, int len) {
		Node cur, prev, next;
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

	public static int lPalin(Node A) {
		int res = 0;
		Node B, head, reversedNode;
		B = A;
		head = A;
		int len = 0;

		while (head != null) {
			len++;
			// System.out.println(head.data);
			head = head.next;
		}
		if (len > 1)
			B = reverseList(B, len);

		reversedNode = B;

		System.out.println("printing reversed list ");
		while (B != null) {
			System.out.println(B.data);
			B = B.next;
		}

		int checkLen = 0;
		checkLen = checkPalin(reversedNode, A);
		System.out.println(checkLen);
		if (checkLen == len)
			res = 1;
		return res;
	}
	
	public static int checkPalin(Node reversedNode , Node A) {
		int checkLen = 0;
		while (reversedNode != null && A != null && (reversedNode.data == A.data)) {
			System.out.println(A.data+" --> "+reversedNode.data);
			checkLen++;
			reversedNode = reversedNode.next;
			A = A.next;
		}
		return checkLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(1);
		System.out.println(lPalin(ll.head));

	}

}
