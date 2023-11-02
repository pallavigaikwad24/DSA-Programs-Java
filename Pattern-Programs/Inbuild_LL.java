package linked_list;

import java.util.*;

public class Inbuild_LL {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		list.addFirst("this");
		list.addLast("list");
		System.out.println(list);
		list.add("Linked");
		System.out.println(list);
		System.out.println("Size of List: "+list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("NULL");
		
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.remove(1);          // index number
		System.out.println(list);
	}

}
