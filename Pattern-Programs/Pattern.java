package pattern;

public class Pattern {
	
	public static void starPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedStar(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void halfPyramidNumber(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void charPattern(int n) {
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
	
	public static void invertedRotatedHalfPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invertedHalfPyramidNumber(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void floydsTriangle(int n) {
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void zeroOneTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	public static void butterfly(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void solidRhombus(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void hollowRhombus(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=n;j++) {
				if(i==1 ||j==1 || j==n || i==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void diamond(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//starPattern(5);
		//invertedStar(5);
		//halfPyramidNumber(5);
		//charPattern(4);
		//invertedRotatedHalfPyramid(5);
		//invertedHalfPyramidNumber(5);
		//floydsTriangle(5);
		//zeroOneTriangle(5);
		//butterfly(5);
		//solidRhombus(5);
		//hollowRhombus(5);
		diamond(4);

	}

}
