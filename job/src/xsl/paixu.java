package xsl;

import java.util.Scanner;

public class paixu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, temp, n;
		int[] ch ;
		System.out.print("please input the number of N :");
		n = sc.nextInt();
		ch = new int[n];
		System.out.println("Input the elements of array:");
		for (i = 0; i < ch.length; i++) {
			ch[i] = sc.nextInt();
		}
		for (i = 0; i < ch.length - 1; i++)
			for (j = 0; j < ch.length - i - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		System.out.println("The sorted array is:");
		for(int a:ch) {
			System.out.print(a + " ");
		}
		
	}
}
