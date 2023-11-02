package queue;

public class Queue_Array {
	static class Queue{
		static int a[];
		static int size;
		static int rear = -1;
		
		Queue(int size){
			a = new int[size];
			this.size = size;
		}
		
		public static boolean isEmpty() {
			return rear == -1;
		}
		
		
		// Enqueue O(1)
		public static void add(int data) {
			if(rear == size-1) {
				System.out.println("Full queue");
				return;
			}
			
			rear++;
			a[rear] = data;
		}
		
		//Dequeue  O(n)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			
			int front = a[0];
			for(int i=0;i<rear;i++) {
				a[i]= a[i+1];
			}
			rear--;
			return front;
		}
		
		//Peek O(n)
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			
			return a[0];
		}
	}
	
	
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
