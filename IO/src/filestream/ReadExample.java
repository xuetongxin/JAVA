package filestream;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) throws IOException {
		try {
			byte[] buf = { 35, 36, 37, 38 };
			// Create the new byte array input stream
			FileOutputStream fout = new FileOutputStream("log//ReadExample.txt");
			ByteArrayInputStream byt = new ByteArrayInputStream(buf);
			// ByteArrayOutputStream output =new ByteArrayOutputStream();
			// output.towrite(ReadExample.txt);
			int k = 0;
			while ((k = byt.read()) != -1) {
				// Conversion of a byte into character
				char ch = (char) k;
				//fout.write((int)k);
				fout.write(ch);
				System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
			}
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}