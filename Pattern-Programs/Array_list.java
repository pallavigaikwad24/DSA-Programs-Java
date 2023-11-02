package array_list;

import java.util.*;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		
		//add element
//		list.add(0);
//		list.add(2);
//		list.add(3);
//		
//		System.out.println(list);
//		
//		// get element
//		int element = list.get(0);
//		System.out.println(element);
//		
//		//add element in between
//		list.add(1,1);  //(index, element)
//		System.out.println(list);
//		
//		// set element
//		list.set(0, 5);
//		System.out.println(list);
//		
//		//delete element
//		list.remove(3);
//		System.out.println(list);
//		
//		//size
//		int size= list.size();
//		System.out.println(size);
//		
//		//loops
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		System.out.println();
//		
//		//sorting
//		Collections.sort(list);
//		System.out.println(list);
		
		String a[]=new String[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<5;i++) {
			a[i]=sc.nextLine();
			list.add(a[i]);
		}
		System.out.println("Elements: ");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("sorted list: ");
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
