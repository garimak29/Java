package linkedlist;

import linkedlist.LinkedList.ListNode;

public class PalindromeList {

	public static int lPalin(ListNode A) {
		int res = 1;
		ListNode head = A, slow = A, fast = A, midNode = null, prev = null;

		// to reach the mid point
		while (fast != null && fast.next != null) {
			// System.out.println("fast ->"+fast.val+" --- slow->"+slow.val);

			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		//prev.next = null;
		slow = reverseNode(slow);
		midNode = slow;
		while (head != null && slow != null) {
			if (head.val == slow.val) {
				System.out.println(head.val + "  --  >" + slow.val);
			} else
				return 0;
			head = head.next;
			slow = slow.next;
		}

		return res;
	}

	private static ListNode reverseNode(ListNode cur) {
		// TODO Auto-generated method stub
		ListNode prev = null, next;
		while (cur != null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		return prev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.insert(1);
		 ll.insert(3);
		ll.insert(3);
		ll.insert(2);
		ll.insert(1);

		System.out.println(lPalin(ll.head));

	}

}


// actual solution 
/*
 * 
 * /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }*//*
 
public class Solution {
    public int lPalin(ListNode A) {
        ListNode slow_ptr = A, fast_ptr = A;
        ListNode second_half, prev_of_slow_ptr = A;
        ListNode midnode = null; // To handle odd size list
        int res = 1; // initialize result
        if (A != null && A.next != null) {
            /* Get the middle of the list. Move slow_ptr by 1
               and fast_ptrr by 2, slow_ptr will have the middle
               ListNode *//*
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;

                /*We need previous of the slow_ptr for
                  linked lists  with odd elements *//*
                prev_of_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            /* fast_ptr would become NULL when there are even elements in list. 
               And not NULL for odd elements. We need to skip the middle ListNode 
               for odd case and store it somewhere so that we can restore the
               original list*//*
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            // Now reverse the second half and compare it with first half
            second_half = slow_ptr;
            prev_of_slow_ptr.next = null; // NULL terminate first half
            second_half = reverse(second_half); // Reverse the second half
            res = compareLists(A, second_half); // compare
        }
        return res;
    }
    public ListNode reverse(ListNode head_ref) {
        ListNode prev = null;
        ListNode current = head_ref;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /* Function to check if two input lists have same val*//*
    int compareLists(ListNode head1, ListNode head2) {
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val == temp2.val) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else return 0;
        }
        /* Both are empty reurn 1*//*
        if (temp1 == null && temp2 == null)
            return 1;
        /* Will reach here when one is NULL
           and other is not *//*
        return 0;
    }
}
 * */
