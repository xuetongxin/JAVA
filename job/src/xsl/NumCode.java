package xsl;

public class NumCode {
	public static int i(int x) {
		
		return x*x*x;
	}
	public static float i(float x) {
		
		return x*x*x;
	}
	public static double i(double x) {
		
		return x*x*x;
	}
	
	public static void main(String[] args) {
		System.out.println("invoke int cube()");
		System.out.println("The cube of a is:"+i(5));
		System.out.println("invoke float cube()");
		System.out.println("The cube of b is:"+i(5.0));
		System.out.println("invoke double cube()");
		System.out.println("The cube of c is:"+i(5.00));

	}

}
