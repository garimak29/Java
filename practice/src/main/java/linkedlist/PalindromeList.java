package linkedlist;

import linkedlist.LinkedList.Node;

public class PalindromeList {

	public static int lPalin(Node A) {
		int res = 0;
		int len = 0, mid;
		Node lenPointer, cur, prev, next = null;
		prev = null;
		cur = A;
		int flag = 0;
		// setting the start and head pointers
		lenPointer = A;
		// reverse half list
		// length
		while (lenPointer != null && A != null) {
			len++;
			// System.out.println(lenPointer.data);
			lenPointer = lenPointer.next;

		}
		// System.out.println("length : "+len);
		if (len == 1)
			return 1;
		else {
			// 1 > 2 > 2 > 1
			if (len % 2 == 0)
				mid = len / 2;
			else
				mid = (len / 2) + 1; // 1> 2> 1
			int j = 0;
			// System.out.println("mid -- >"+mid);
			while (j < mid) {
				// reverse the links till u reach the mid

				// 1>2 -- > 2>1
				// c
				// p n
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
				j++;
				/*
				 * System.out.println(cur.data+" curr  ");
				 * System.out.println(prev.data+" prev ");
				 * 
				 */}

			Node midNode = prev;

			// from mid to len now compare the list , as we have already reversed the list ,
			// so
			// now the first half of the pointer will point towards left
			/*
			 * 1> 2> 3> 4> 3> 2> 1 after above while loop 1< 2< 3< 4> 3> 2> 1 cur midNode
			 */
			System.out.println(next.data + " -- >" + midNode.data + " mid" + mid);

			if (len % 2 != 0)
				midNode = midNode.next;
			System.out.println(next.data + " -- >" + midNode.data + " mid" + mid);

			while (mid < len && next != null && midNode != null) {
				mid++;

				// compare the first half and second half of the list
				if (next.data == midNode.data) {
					System.out.println("true");
					System.out.println(next.data + " -- >" + midNode.data + " mid" + mid);

					next = next.next;
					midNode = midNode.next;
					flag = 1;
				} else {
					res = 0;
					flag =0;
					break;
				}

			}
			// last case
		//	System.out.println(next.data + " -- >" + midNode.data + " mid" + mid);
			
			if (next.data == midNode.data) {
				System.out.println(next.data + " -- >" + midNode.data + " mid" + mid);
				flag = 1;
			}
			else {
				res = 0;
				
			}
			// if matches then its palindrome else not
			if (mid == len && flag == 1)
				res = 1;

		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(7);
		ll.insert(7);
		ll.insert(1);

		System.out.println(lPalin(ll.head));

	}

}
