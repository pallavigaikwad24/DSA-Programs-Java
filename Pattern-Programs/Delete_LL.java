package linked_list;
import java.util.*;

public class Delete_LL {
	
	private int size=0;
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
			
			size++;
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
	}
	
	public void remove() {
		if(head==null) {
			System.out.println("List is empty");
		}
		size--;
		
		Node currNode = head;
		if(currNode.data > 25) {
			head=head.next;
		}
		
	}
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
		}
		
		Node currNode=head;
		while(currNode != null) {
			
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		
		System.out.println("NULL");
	}
	public int size() {
		
		return size;
	}
	
	
	public static void main(String[] args) {
		Delete_LL list = new Delete_LL();
		
		Scanner sc=new Scanner(System.in);
		int input=0;
		
		System.out.println("Enter values: ");
		for(int i=0;i<10;i++) {
			input=sc.nextInt();
			list.addLast(input);
			
			if(input>25) {
				list.remove();
			}
		}
		list.printList();
	
	}

}
