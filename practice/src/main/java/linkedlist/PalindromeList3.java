package linkedlist;

import linkedlist.LinkedList.Node;

public class PalindromeList3 {
	
	public static int max(int a , int b) {
		if(a >= b)
			return a;
		else 
			return b;
	}
	public static int largestPrefix(Node h1 , Node h2) {
		int ans = 0;
		while(h1 != null && h2!= null && h1.data == h2.data) {
			h1 = h1.next;
			h2= h2.next;
		}
		return ans;
	}

	public static int lPalin(Node A) {

		int res = 0;
		Node prev = null, head = A, curr = head, next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			// even
			res = max(res, 2 * largestPrefix(curr, next));
			// odd
			res = max(res, 2 * largestPrefix(prev, next) + 1);
			
			prev = curr;
			curr = next;
		}
		
		return res;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert(1);
		ll.insert(7);
		ll.insert(9);
		ll.insert(7);
	//	ll.insert(1);

		System.out.println(lPalin(ll.head));

	}
}
