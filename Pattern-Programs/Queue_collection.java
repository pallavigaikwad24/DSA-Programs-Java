package queue;

import java.util.*;
public class Queue_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> q=new LinkedList<>();   // Queue is a interface not a class that's why we cannot create object, so we can implement queue using LinkedList.
		Queue<Integer> q=new ArrayDeque<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
 
	}

}
