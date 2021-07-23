package a;
import java.util.Scanner;
public class ReadFileFromUrl {

	public static void main(String[] args) throws java.io.IOException {
		// TODO 自动生成的方法存根
		String URLString =new Scanner(System.in).next();
		
		try {
			java.net.URL url=new java.net.URL(URLString);
			int count =0;
			Scanner sc =new Scanner(url.openStream());
			while(sc.hasNext()) {
				String line=sc.nextLine();
				count+=line.length();	
			}
			System.out.println("The file size is"+count+"charaters");
		}
		catch(Exception ex) {
			System.out.println("Invalid URL");
			
		}
	}

}
