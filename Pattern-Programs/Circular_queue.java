package queue;

public class Circular_queue {
	
	static class Queue{
		static int a[];
		static int size;
		static int rear = -1;
		static int front =-1;
		
		Queue(int size){
			a = new int[size];
			this.size=size;
			
		}
		
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		public static boolean isFull() {
			return (rear+1)%size == front;
		}
		
		public static void add(int data) {
			
			if(isFull()) {
				System.out.println("Full Queue");
				return;
			}
			
			// 1st element add
			if(front == -1) {
				front=0;
			}
			
			rear = (rear+1)%size;
			a[rear] = data;
		}
		
		//Dequeue O(1)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			int result = a[front];
			
			//Single element condition
			if(rear == front) {
				rear = front =-1;
			}else {
				front= (front+1)%size;
			}
			
			return result;
		}
		
		public static int peek() {
			return a[front]; 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.add(6);
		q.remove();
		q.add(7);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
