package basic;
import java.util.*;
public class table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for printing table: ");
		int number = sc.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(i*number);
			
		}
	}

}
