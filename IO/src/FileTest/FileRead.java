package FileTest;
import java.io.*;
public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		File file=new File("log//FileReader.txt");
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bf =new BufferedReader(reader);
			String str = null;
			while ((str =bf.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
