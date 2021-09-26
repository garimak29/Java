package linkedlist;

public class LinkedList {

	Node head;

	public class Node {
		int data;
		Node next;

		Node(int x) {
			this.data = x;
			next = null;
		}
		public void printNodeList(Node n) {
			
			while(n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
		public int linkedListLength(Node linkedList) {
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
				Node node = head ;
				for(int i=0;i<index-1;i++) {
					node = node.next;
				}
				
				//1>>2>>3>>4?? null
				//insert 5 at 3
				// 2 > next will point to 5
				// 5 > next will point to 3
				Node newNode = new Node(data);
				newNode.next = node.next;
				node.next = newNode;
				
			}
		}

		public void delete(int index) {
			
		}
		public Node insert(int data) {
			Node newNode = new Node(data);
			
			if(head ==  null) {
				head= newNode;
				
			}
			else {
				Node node = head;
				while(node.next != null) {
					node = node.next;
				}
				 // 1>>2>>3>>null
				//4>>null
				node.next=newNode;
				
			}
			return null;
		}
		

		public Node insertAtStart(int data) {
			Node newNode = new Node(data);
			
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
		Node n = head;
		while(n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
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
