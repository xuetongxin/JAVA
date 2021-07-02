package Wdemo;
import java.util.Scanner;
import java.lang.System;
public class a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in,"UTF-8");
		int[] a= {1,2,3,4};
		int[] b=new int[a.length];
		System.arraycopy(a,0,b,0,a.length);
		String s="123";
		String r="123";
		if(s.matches(r)) {
			System.out.println("Yes");  
		}
		for(int c:b) {
		System.out.println(c);
		}
		
	}
}
