package linked_list;


public class Linked_List {
	
	private int size;
	
	Linked_List(){
		this.size=0;
	}
	
	Node head;
	
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			
			size++;
		}
	}
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		newNode.next = head;    //Head assign to next node
		head=newNode;           //newNode assign to head
	}
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
	
		Node currNode=head;
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		head=head.next;
	}
	
	public void deleteLast() {
	
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next=null;
		
	}
	
	public int gerSize() {
		return size;
	}
	public void printList() {
		
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode=head;
		
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
		
	}

	public static void main(String[] args) {
		Linked_List list=new Linked_List();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.addLast("List");
		list.printList();
		list.addFirst("This");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
		
		System.out.println(list.gerSize());
		list.addFirst("This");
		list.printList();
		
		System.out.println(list.gerSize());
	}

}
