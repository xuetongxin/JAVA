package experiment;

import java.awt.List;
import java.util.Scanner;
import java.util.Set;

public class list {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入列表长度");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b=new int[n];
		a[0] = sc.nextInt();
		b[0]=a[0];
		for (int i = 1; i < a.length; i++) {
			int c = sc.nextInt();
			for (int j = 0; j < a.length; j++) {
				if (a[j] == c) {
					break;
				} else {
					b[j]=c;
				}
				
			}
		}
		
		System.out.print("输出:");
		for(int e:a) {
			System.out.println(e);
		}
	}
}
