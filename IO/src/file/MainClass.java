package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class MainClass
{

	//public static void write(String[] args,String fileName) 
         public  static  void  write(String[]  args,String  fileName) {
                	try  {
                		DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName));
                	
                		for(int i = 0;i < args.length;i++) {
                			//out.writeBytes((Integer.valueOf(args[i])));
                		}
                	}catch  (Exception  e)  {
                        e.printStackTrace();
                	}
                	
                } 
                        


	public static void read(String fileName) {
		
		int sum = 0;
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(fileName));
			while(in.available()>0) {
				sum += in.readInt();
			}			
			System.out.println("The sum is:" + sum);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		write(args,"test.dat");
		read("test.dat");

	}
}

