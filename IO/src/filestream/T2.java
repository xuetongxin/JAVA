package filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		try {
			File f = new File("log//score.txt");
			File f2 = new File("log//scoreAnalysis.txt");
			Scanner sc = new Scanner(new FileInputStream(f), "utf-8");
			PrintStream out = new PrintStream(new FileOutputStream(f2), true, "utf-8");
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				String[] strs = s.split("，");
				int total = 0;
				for (int i = 0; i < strs.length; i++) {
					char strs1[] = strs[i].toCharArray();
					int scores = 0;
					for (int j = 0; j < strs1.length; j++) {
						if (strs1[j] >= '0' && strs1[j] <= '9') {
							scores = 10 * scores + strs1[j] - 48;
						}
					}
					total += scores;
				}
				out.println(s + "，总成绩:" + total);
			}
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
