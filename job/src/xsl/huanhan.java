package xsl;

import java.util.Scanner;
public class huanhan {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double money=input.nextDouble();
		int i=(int)(money*100);
		int dollars=i/100;
		i=i%100;
		int quarters=i/25;
		i=i%25;
		int dimes=i/10;
		i=i%10;
		int nickels=i/5;
		i=i%5;
		int pennys=i/1;
		System.out.println(dollars + " dollars");
	    	System.out.println(quarters + " quarters");
	    	System.out.println(dimes + " dimes");
	    	System.out.println(nickels + " nickels");
	    	System.out.println(pennys + " pennies");

	}

}
