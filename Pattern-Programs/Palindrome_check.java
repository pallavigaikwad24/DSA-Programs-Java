package assignment_12;

public class Palindrome_check {
	
	public static void isPalindrome(int n) {
		
		int palindrome = n;
		int reverse=0;
		
		while(palindrome != 0) {
			int rem = palindrome%10;
			
			reverse = reverse * 10+rem;
			
			palindrome = palindrome/10;
		}
		
		if(n==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		
		isPalindrome(1321);

	}

}
