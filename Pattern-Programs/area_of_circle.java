package basic;
import java.util.*;
public class area_of_circle {
	public static void main (String args[]) {
		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double area = pi * (radius*radius);
		System.out.println("Area of circle: "+area);
	}
}
