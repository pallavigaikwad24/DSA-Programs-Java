package assignment_3;

import java.util.*;
public class Prime_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		
		boolean isPrime = true;
		if(n==2) {
			System.out.println("Prime");
		}else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime = false;
				}
			}
			
			if(isPrime) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		}
	}

}
