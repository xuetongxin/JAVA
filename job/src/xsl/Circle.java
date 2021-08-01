package xsl;
import java.util.Scanner;
public class Circle {
	public static double getarea(double r) {
		double area;
		area=Math.PI*r*r;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextInt();
		double y=getarea(r);
		System.out.println("The area of the circle of radius %.2f is %.2f"+r+y);                                                                
	}

}
