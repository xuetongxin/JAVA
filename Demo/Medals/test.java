package Medals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Scanner;

import Medals.SelectMedals;
import SelectMedals.BronzeMedals;
import SelectMedals.GoldMedals;
import SelectMedals.SilverMedals;

public class test {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);

		// stare the databases

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
		PreparedStatement stmt = null;
		System.out.println("are you want to update databases or insert new databases");
		System.out.println("you can input 'updata' or 'insert'");
		String choice = sc.nextLine();
		if (choice.matches("updade")) {
			stmt = con.prepareStatement(
					"insert into medalsmysql (goldmedals,silvermedals,bronzemedals) values(?,?,?) where country='?");
		}else {
			stmt = con.prepareStatement(
					"insert into medalsmysql (country,goldmedals,silvermedals,bronzemedals) values (?,?,?,?)");
		}

		ResultSet rs = null;

		// input the number of medals
		System.out.print("请输入你准备录入金牌个数:");
		int GoldCount = sc.nextInt();
		GoldMedals[] gold = new GoldMedals[GoldCount];
		if (!(GoldCount == 0)) {
			System.out.println("请依次输入 金牌个数 运动员名字 运动项目 所属国家 ");
		}
		for (int i = 0; i < gold.length; i++) {
			gold[i] = new GoldMedals();
			gold[i].setcount(sc.nextInt());
			gold[i].setpalyername(sc.next());
			gold[i].setsport(sc.next());
			gold[i].setcountry(sc.next());

		}
		System.out.print("请输入你准备录入的银牌个数:");
		int SilverCount = sc.nextInt();
		if (!(SilverCount == 0)) {
			System.out.println("请依次输入 银牌个数 运动员名字 运动项目 所属国家 ");
		}
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
		if (!(BronzeCount == 0)) {
			System.out.println("请依次输入 铜牌个数 运动员名字 运动项目 所属国家 ");
		}
		BronzeMedals[] bronze = new BronzeMedals[BronzeCount];
		for (int i = 0; i < bronze.length; i++) {
			bronze[i] = new BronzeMedals();
			bronze[i].setcount(sc.nextInt());
			bronze[i].setpalyername(sc.next());
			bronze[i].setsport(sc.next());
			bronze[i].setcountry(sc.next());
		}
		if(choice.matches("uodate")) {
			for (int i = 0; i < GoldCount; i++) {
				stmt.setString(4, gold[i].getcountry());
				stmt.setInt(1, gold[i].getcount());
				stmt.setInt(2, silver[i].getcount());
				stmt.setInt(3, bronze[i].getcount());
				stmt.executeUpdate();
			}
		}
		else {
			for (int i = 0; i < GoldCount; i++) {
				stmt.setString(1, gold[i].getcountry());
				stmt.setInt(2, gold[i].getcount());
				stmt.setInt(3, silver[i].getcount());
				stmt.setInt(4, bronze[i].getcount());
				stmt.executeUpdate();
			}
		
		 * System.out.println("请输入查询条件:"); int medalcount = 0; String playername = null;
		 * String sport = null; String country = null;
		 * 
		 * System.out.print("medalscount:"); medalcount = sc.nextInt();
		 * System.out.print("playername:"); playername = sc.next();
		 * System.out.print("sport:"); sport = sc.next(); System.out.print("country:");
		 * country = sc.next();
		 * System.out.println("what kinds of medal do you want to know ?"); String
		 * choice = sc.next(); if (choice.matches("gold")) { if(GoldCount==0) {
		 * System.out.print("没有一枚金牌!"); }else System.out.println("金牌查询:");
		 * SelectMedals.select(gold, medalcount, playername, sport, country); } else if
		 * (choice.matches("silver")) { if(SilverCount==0) {
		 * System.out.print("没有一枚银牌!"); }else System.out.println("银牌查询:");
		 * SelectMedals.select(silver, medalcount, playername, sport, country); } else {
		 * if(BronzeCount==0) { System.out.print("没有一枚铜牌!"); }else
		 * System.out.println("铜牌查询:"); SelectMedals.select(bronze, medalcount,
		 * playername, sport, country); }
		 
	}

}
