package Work;

import java.net.*;

public class Sever {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			ServerSocket so = new ServerSocket(12345);
			Socket s = so.accept();
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
