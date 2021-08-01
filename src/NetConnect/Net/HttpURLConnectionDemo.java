package Net;

import java.net.*;

// 获取URL信息
public class HttpURLConnectionDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.javatpoint.com/java-tutorial");
			HttpURLConnection huc = (HttpURLConnection) url.openConnection();
			for (int i = 1; i <= 8; i++) {
				System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
			}
			huc.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}