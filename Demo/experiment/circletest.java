package experiment;

import java.util.InputMismatchException;
import java.util.Scanner;
public class circletest{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
			try {
				System.out.print("Input a radius:");
				double r=input.nextDouble();
				double area;
				area=Math.PI*r*r;
				System.out.print("area=%.2f"+area);
			}
			catch(InputMismatchException ex) {
				System.out.println("java.util.InputMismatchException");
				System.out.println("Number Format Error.");
			}
	}
}


