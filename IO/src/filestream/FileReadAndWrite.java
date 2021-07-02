package filestream;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadAndWrite{

	public static void main(String[] args) {
		System.out.println("please input your databases");
		String[] s = {"hello world","hello java","hello 薛世龙"};
		write(s);
		
		try {
			// read file content from file
			FileReader reader = new FileReader("log//test1.txt");
			BufferedReader br = new BufferedReader(reader);
			String str = null;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static void write(String[] args) {
       try{
           		BufferedWriter in = new BufferedWriter(new FileWriter("log//test.txt"));
           		for(int i = 0;i < args.length;i++) {
           			in.write(args[i]+"\n");
           		}
           		in.flush();
           		in.close();
           	}
           	catch(Exception ex) {
           		ex.printStackTrace();;
           	}
       finally {
    	   System.out.println("successful");
    	   
       }
       	
	}
	
}


