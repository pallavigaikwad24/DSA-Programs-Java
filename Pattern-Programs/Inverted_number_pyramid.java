package basic;

public class Inverted_number_pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,k=1;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
			}
			k++;
			System.out.println();
		}

	}

}
