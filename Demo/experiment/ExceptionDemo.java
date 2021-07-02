package experiment;

import java.util.Scanner;

public class ExceptionDemo {
	public static void enfu(int r) throws myexception {

		if (r < 0)
			throw new myexception();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		try {
			enfu(r);
		} catch (myexception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}

class myexception extends Exception {

	private static final long serialVersionUID = 8332329749879000768L;

	public String toString() {
		return "Exception is processed";
	}
}
