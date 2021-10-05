package linkedlist;

public class LinkedList {

	ListNode head;

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
			next = null;
		}
		public void printNodeList(ListNode n) {
			
			while(n.next != null) {
				System.out.println(n.val);
				n = n.next;
			}
			System.out.println(n.val);
		}
	}
		public int linkedListLength(ListNode linkedList) {
			int len = 0;
			while (linkedList.next != null) {
				len++;
				linkedList = linkedList.next;
				
			}
			//why +1 because we will reach only head.next part where this will be null for 
			// the last node so the last node would not be counted
			return len+1;
		}

		public void insertInBetween(int index , int data) {
			if(index == 0) {
				insertAtStart(data);
			}
			else {
				ListNode listNode = head ;
				for(int i=0;i<index-1;i++) {
					listNode = listNode.next;
				}
				
				//1>>2>>3>>4?? null
				//insert 5 at 3
				// 2 > next will point to 5
				// 5 > next will point to 3
				ListNode newNode = new ListNode(data);
				newNode.next = listNode.next;
				listNode.next = newNode;
				
			}
		}

		public void delete(int index) {
			
		}
		public ListNode insert(int data) {
			ListNode newNode = new ListNode(data);
			
			if(head ==  null) {
				head= newNode;
				
			}
			else {
				ListNode listNode = head;
				while(listNode.next != null) {
					listNode = listNode.next;
				}
				 // 1>>2>>3>>null
				//4>>null
				listNode.next=newNode;
				
			}
			return null;
		}
		

		public ListNode insertAtStart(int data) {
			ListNode newNode = new ListNode(data);
			
			if(head == null) {
				head = newNode;
			}
			else {
				//1>>2>>3>>null
				//0
				//head > 1
				// make head point to 0 & 0 next to 1
				newNode.next = head;
				head = newNode;
				
			}
			return null;
			
		}
		
		
		
	public void printList() {
		ListNode n = head;
		while(n.next != null) {
			System.out.println(n.val);
			n = n.next;
		}
		System.out.println(n.val);
	}
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insertAtStart(0);
		list.insert(8);
		list.insertInBetween(2, 10);
		list.printList();
	}
}
