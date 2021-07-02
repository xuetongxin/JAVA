//如何換行???


package Scanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		
		try {
			Scanner sc = new Scanner(new File("log//score.txt"),"UTF-8");
			FileWriter writer=new FileWriter("log//Scanneroutputfile.txt");
			//FileReader reader=new FileReader("hello");
			FileOutputStream output =new FileOutputStream("log//Scanneroutputfile.txt");
			
			while (sc.hasNext()) {
				String str = sc.next();
				//FileOutput write string have two steps
				 
				byte[] b=str.getBytes();
 				output.write(b);
 				
				//Writer String by file.writer()
 				/*
 				 writer.write(str); 
				*/	
			}
			
			
			
			
			sc.close();
			output.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			System.out.println("successful");
		}
	}

}


