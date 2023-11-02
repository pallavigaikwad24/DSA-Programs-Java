package basic;
import java.util.*;
public class menu_driven {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input;
		int marks;
		do {
			System.out.print("ENter Marks: ");
			marks=sc.nextInt();
			if(marks>=90 && marks<=100) {
				System.out.println("This is good");
			}
			else if(marks<=89 && marks>=60) {
				System.out.println("THis is also good");
			}
			else if(marks<=59 && marks>=0) {
				System.out.println("This is good as well");
			}
			
			System.out.println("Want to continue to enter 1 or 0: ");
			input=sc.nextInt();
		}while(input==1);
		
	}
}
