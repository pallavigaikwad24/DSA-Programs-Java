package linked_list;
import java.util.*;
public class Search_LL {
	
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
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		newNode.next =head;
		head=newNode;
	}
	
	public void addLast(int data) {
		Node newNode =new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		
		Node currNode=head;
		
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
		
		Node currNode = head;
		
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");	
	}
	
	public int size() {
		return size;
	}
	public void searchList() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be search: ");
		int value=sc.nextInt();
		
		if(head==null) {
			System.out.println("List is empty you cannot perform search!");
			return;
		}
		
		Node currNode = head;
		
		for(int i=0;i<size();i++) {
			
			if(currNode.data == value) {
				System.out.println("The element "+currNode.data+" found at index: "+i);
			}
			currNode=currNode.next;
		}
		
	}

	public static void main(String[] args) {
		Search_LL list=new Search_LL();
		list.addFirst(1);
		list.addLast(5);
		list.addLast(7);
		list.addLast(3);
		list.addLast(8);
		list.addLast(2);
		list.addLast(3);
		
		list.printList();
		list.searchList();
		list.printList();

	}

}
