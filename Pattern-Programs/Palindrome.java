package linked_list;


public class Palindrome {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next != null) {
			currNode=currNode.next;
		}
		
		currNode.next = newNode;
		
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		
		Node curr=head;
		while(curr != null) {
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.print("NULL");
	}
	
	public Node reverse(Node head) {
		Node prev=null;
		Node curr = head;
		
		while(curr!=null) {
			Node nextNode = curr.next;
			curr.next=prev;
			
			prev=curr;
			curr=nextNode;
		}
		
		return prev;
	}
	
	public Node findMiddle() {
		Node hare=head;
		Node turtle=head;
		
		while(hare.next!=null && hare.next.next!=null) {
			hare=hare.next.next;
			turtle=turtle.next;
		}
		
		return turtle;
	}
	public boolean isPalindrome() {
		if(head==null || head.next==null) {
			return true;
		}
		
		Node middle = findMiddle();
		Node secondHalfStart = reverse(middle.next);
		Node firstHalfStart = head;
		
		while(secondHalfStart != null) {
			if(firstHalfStart.data != secondHalfStart.data) {
				System.out.println("\nList is not Palindrome");
				return false;
			}
			firstHalfStart=firstHalfStart.next;
			secondHalfStart=secondHalfStart.next;
		}
		System.out.println("\nList is Palindrome");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome list = new Palindrome();
		list.addLast(1);
		list.addLast(2);
		list.addLast(1);
		//list.addLast(3);
		list.printList();
		list.isPalindrome();

	}

}
