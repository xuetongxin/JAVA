package filestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamExample {  
    public static void main(String[] args) throws IOException {  
        File data = new File("log\\FilterOutputStreamExample.txt");  
        FileOutputStream file = new FileOutputStream(data);  
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="WelcometojavaTpoint.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
}  
