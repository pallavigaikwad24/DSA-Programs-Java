package linked_list;

public class Loop_or_not {
	
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
			head=newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next=newNode;
		
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node curr=head;
		while(curr!=null) {
			
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		
		System.out.println("Null");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop_or_not list=new Loop_or_not();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();
	}

}
