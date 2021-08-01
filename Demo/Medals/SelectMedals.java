package Medals;

import SelectMedals.BronzeMedals;
import SelectMedals.GoldMedals;
import SelectMedals.SilverMedals;

public class SelectMedals {
	public SelectMedals(){}
	public static void select(GoldMedals[] gold, int goldmedalcount, String playername,String sport, String country) {
		for (int i = 0; i < gold.length; i++) {
			if (goldmedalcount == gold[i].getcount() || playername.matches(gold[i].getplayername())
					|| sport.matches(gold[i].getsport()) || country.matches(gold[i].getcountry())) {
				System.out.println(gold[i].getcount());
				System.out.println(gold[i].getplayername());
				System.out.println(gold[i].getsport());
				System.out.println(gold[i].getcountry());
			}
		}
	}
	
	public static void select(SilverMedals[] silver, int goldmedalcount,  String playername,String sport, String country) {
		for (int i = 0; i < silver.length; i++) {
			if (goldmedalcount == silver[i].getcount() || playername.matches(silver[i].getplayername())
					|| sport.matches(silver[i].getsport()) || country.matches(silver[i].getcountry())) {
				System.out.println(silver[i].getcount());
				System.out.println(silver[i].getplayername());
				System.out.println(silver[i].getsport());
				System.out.println(silver[i].getcountry());
			}
		}
	}
	
	public static void select(BronzeMedals[] bronze, int goldmedalcount,String playername, String sport,  String country) {
		for (int i = 0; i < bronze.length; i++) {
			if (goldmedalcount == bronze[i].getcount() || playername.matches(bronze[i].getplayername())
					|| sport.matches(bronze[i].getsport()) || country.matches(bronze[i].getcountry())) {
				System.out.println(bronze[i].getcount());
				System.out.println(bronze[i].getplayername());
				System.out.println(bronze[i].getsport());
				System.out.println(bronze[i].getcountry());
			}
		}
	}
}
