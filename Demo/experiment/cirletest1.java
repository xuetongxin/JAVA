package experiment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class cirletest1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean continueInput=true;
		do {
		try {
			int r=sc.nextInt();
			judgment(r);
			System.out.println(area(r));
			continueInput=false;
				}
		catch(InputMismatchException ex){
			System.out.println("Input a radius:a\njava.util.InputMismatchException\nNumber Format Error.");
				sc.nextLine();
				}
			}while(continueInput);

	}
	static double area(int r) {
		return Math.PI*r*r;
	}
	public static int judgment(int r) {
		if(r>=0||r<0)
			return r;
		else 
			throw new InputMismatchException();
	}
}
