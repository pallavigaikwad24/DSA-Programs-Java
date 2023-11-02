package basic;
import java.util.*;
public class calculator {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for operation: ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
		System.out.println("Enter choice for operation: ");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1: System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: System.out.println(a/b);
		break;
		default : System.out.println("Invalid choice Please enter valid option");
		}
	}

}
