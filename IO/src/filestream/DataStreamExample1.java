package filestream;

import java.io.FileInputStream;  
public class DataStreamExample1 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("log//DataStreamExample1.txt");    
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }