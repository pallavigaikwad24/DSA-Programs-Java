package basic;
import java.util.*;
public class even {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Even no.: ");
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
