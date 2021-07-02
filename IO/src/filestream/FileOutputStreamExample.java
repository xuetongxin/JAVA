package filestream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("log//FileOutputStreamExample.txt");
			fout.write(66);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
