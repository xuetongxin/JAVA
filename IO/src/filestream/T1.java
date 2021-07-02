package filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("log//oplog.txt");
		//@SuppressWarnings("resource")
		PrintStream output = new PrintStream(new FileOutputStream(f),true,"utf-8");
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in,"utf-8");
		String s = sc.nextLine();
		while(true) {
			boolean status = s.contains("#");
			if(!status) {
				output.println(s);
				s = sc.nextLine();
			}
			else {
				String[] strs = s.split("#");
				output.print(strs[0]);
				break;
			}
		}
		sc.close();
		output.close();
		//System.exit(1);
	}

}

