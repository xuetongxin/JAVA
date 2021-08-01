package experiment;

import java.util.Scanner;

import SelectMedals.BronzeMedals;
import SelectMedals.GoldMedals;
import SelectMedals.SilverMedals;

public class testmedals {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		
		
		input();
		
		
		
	}

	static void input() {

		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你准备录入金牌个数:");
		int GoldCount = sc.nextInt();
		GoldMedals[] gold = new GoldMedals[GoldCount];
		
		for (int i = 0; i < gold.length; i++) {
			gold[i] = new GoldMedals();
			gold[i].setcount(sc.nextInt());
			gold[i].setpalyername(sc.next());
			gold[i].setsport(sc.next());
			gold[i].setcountry(sc.next());

		}
		System.out.print("请输入你准备录入的银牌个数:");
		int SilverCount = sc.nextInt();
		SilverMedals[] silver = new SilverMedals[SilverCount];
		for (int i = 0; i < silver.length; i++) {
			silver[i] = new SilverMedals();
			silver[i].setcount(sc.nextInt());
			silver[i].setpalyername(sc.next());
			silver[i].setsport(sc.next());
			silver[i].setcountry(sc.next());
		}

		System.out.print("请输入你准备录入的铜牌个数:");
		int BronzeCount = sc.nextInt();
		BronzeMedals[] bronze = new BronzeMedals[BronzeCount];
		for (int i = 0; i < silver.length; i++) {
			bronze[i] = new BronzeMedals();
			bronze[i].setcount(sc.nextInt());
			bronze[i].setpalyername(sc.next());
			bronze[i].setsport(sc.next());
			bronze[i].setcountry(sc.next());
		}
	}
}
