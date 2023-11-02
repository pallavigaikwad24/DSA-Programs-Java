package linked_list;

public class Reverse_LL {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next=null;
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	public void printlist() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode =  currNode.next;
		}
		
		System.out.println("NULL");
	}

	public void reverseiterate() {
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		
		head.next = null;
		head = prevNode;
	}
	
	public Node reverseRecursive(Node head) {
		
		if(head == null || head.next==null) {
			return head;
		}
		
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reverse_LL list = new Reverse_LL();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printlist();
		
		//list.reverseiterate();
		list.head = list.reverseRecursive(list.head);
		list.printlist();

	}

}
