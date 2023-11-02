package linked_list;

import java.util.*;
public class Delete_nth_node_last {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		
		Node curr = head;
		while(curr != null) {
			
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.print("NULL");
	}
	public void deleteNth() {
		
		if(head == null || head.next==null) {
			return;
		}
		System.out.println("\nEnter nth value from last to delete node: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int size=1;
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
			size++;
		}
		if(n==size) {
			head=head.next;
			return;
		}
		
		int indexToSearch = size-n;
		
		Node prev= head;
		int i=1;
		
		while(i<indexToSearch) {
			prev=prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete_nth_node_last list =  new Delete_nth_node_last();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.printList();
		list.deleteNth();
		list.printList();
	}

}
