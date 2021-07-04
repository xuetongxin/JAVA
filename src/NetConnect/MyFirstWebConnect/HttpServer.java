package MyFirstWebConnect;

import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {
	private ServerSocket server;
	public HttpServer() {
		try {
			server=new ServerSocket(8080);
		}catch(Exception e) {
			System.out.println("服务器无法启动");
			e.printStackTrace();
			System.exit(1);
		}
	}
	/*
	 * 启动服务器接收客户端的请求，对此请求进行解析，生成响应；
	 */
	public void run () {
		while(true) {
			try {
				Socket socket=server.accept();
				RequestProcess requestPro=new RequestProcess(socket);
				//启动线程进行请求处理
				Thread  thread=new Thread(requestPro);
				thread.start();
			}catch(Exception e) {
				System.out.println("客户端连接异常");
				e.printStackTrace();
			}
		}
	}
}
