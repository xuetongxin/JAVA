package Net;

import java.io.*;
import java.net.*;

public class MyClient {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost", 6666);
			//Socket ss=new Socket("192.168.121.1",5555);
			FileInputStream input =new FileInputStream(new File("MyClient.txt"));
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			//dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
