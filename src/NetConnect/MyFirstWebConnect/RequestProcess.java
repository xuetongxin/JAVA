package MyFirstWebConnect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Map.Entry;
import java.util.Set;

public class RequestProcess implements Runnable{
	 private Socket socket;
	 public RequestProcess(Socket socket) {
		this.socket=socket;
	}
	
	public void run() {
		try {
			Request req=getReauest();
			Responce resp= requestProcess(req);
			printResponce(resp);
		}catch(Exception e) {
			System.out.println("无法读取客户端的联系");
			e.printStackTrace();
		}
	}
	Request getReauest() throws IOException{
		InputStream io=this.socket.getInputStream();
		Request request=new Request();
		BufferedReader br=new BufferedReader(new InputStreamReader(io));
		String line;
		line=br.readLine();
		String[] requestLine =line.split(" ");
		request.setMethod(requestLine[0]);
		request.setResourcePath(requestLine[1]);
		
		
		while((line=br.readLine())!=null&&!"".equals(line)) {
			String[] heads=line.split(":");
			request.setRequestHead(heads[0], heads[1]);
		} 
		return request;
	}
	
	private Responce requestProcess(Request request) throws IOException{
		Responce resp=new Responce();
		String resource=request.getResourcePath();
		FileInputStream fr=null;
		try {
			File file=new File(System.getProperty("user.dir")+resource);
			fr =new FileInputStream(file);
			byte[] body =new byte[(int)file.length()];
			fr.read(body);
			resp.setRespBody(body);
		}catch(IOException e) {
			resp.setRespCode(404);
		}finally {
			if(fr!=null) {
				fr.close();
			}
		}
		return resp;
	}
	
	
	private void printResponce(Responce resp)throws IOException{
		System.out.println("开始生成响应");
		OutputStream out=this.socket.getOutputStream();
		PrintStream ps=new PrintStream(out);
		StringBuffer sb=new StringBuffer();
		// 设置响应行
		sb.append("HTTP/1.1 200 Ok \n\r");
		//设置响应头
		Set<Entry<String ,String>> set=resp.getRespHead().entrySet();
		for(Entry<String ,String> entry:set) {
			sb.append(entry.getKey())
			.append(":")
			.append(entry.getValue())
			.append("\n\r");
		}
		
		//设置响应正文
		sb.append("\n\r");
		if(resp.getRespBody()!=null) {
			sb.append(new String(resp.getRespBody()));
			
		}
		ps.println(sb.toString());
		ps.flush();
		ps.close();
	}
}
