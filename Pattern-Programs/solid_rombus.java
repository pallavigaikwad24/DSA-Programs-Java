package basic;

public class solid_rombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=6;j++) {
				System.out.print("*");
			}
			
			System.out.println();		}
	}

}
