package xsl;
import java.util.Scanner;
public class ComplexNumber {
	public static void complexadd(double r,double i,double a,double b) {
		double x,y;
		 x=r+a;
		 y=i+b;
		 if(y>0)
			 System.out.println(x+"+"+y+"i");
		 else if(y<0)
			 System.out.println(x+""+y+"i");
		 else
			 System.out.println(x);
	}
	public static void complexminus(double r,double i,double a,double b) {
		double x,y;
		x=r-a; 
		y=i-b;
		if(y>0)
			 System.out.println(x+"+"+y+"i");
		 else if(y<0)
			 System.out.println(x+""+y+"i");
		 else
			 System.out.println(x);
	}
	public static void complexmulti(double r,double i,double a,double b) {
		double x,y;
		x=r*a-1*(i*b);
		y=r*b+i*a;	
		if(y>0)
			 System.out.println(x+"+"+y+"i");
		 else if(y<0)
			 System.out.println(x+""+y+"i");
		 else
			 System.out.println(x);
	}
	public static void main(String[] args) {
		
		
		
		
		double r=4;
		double i=3;
		double a=2;
		double b=1;
		complexadd( r,i,a,b);
		complexminus( r,i,a,b);
		complexmulti( r,i,a,b);
	}

}
