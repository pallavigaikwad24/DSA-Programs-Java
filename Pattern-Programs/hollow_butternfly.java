package basic;

public class hollow_butternfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1||j==1|j==i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			int spaces = 2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(i==1||j==1||j==i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(i==1||j==1||j==i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			int spaces = 2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				if(i==1||j==1||j==i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
