package filestream;

import java.io.*;    
class SequenceInputStreamExample{    
  public static void main(String args[])throws Exception{    
   FileInputStream fin1=new FileInputStream("log//SequenceInputStreamExample1.txt");    
   FileInputStream fin2=new FileInputStream("log//SequenceInputStreamExample2.txt");    
   FileOutputStream fout=new FileOutputStream("log//SequenceInputStreamExample3.txt");      
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
   int i;    
   while((i=sis.read())!=-1)    
   {    
     fout.write(i);        
   }    
   sis.close();    
   fout.close();      
   fin1.close();      
   fin2.close();       
   System.out.println("Success..");  
  }    
}
