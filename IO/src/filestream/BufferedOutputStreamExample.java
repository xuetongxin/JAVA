package filestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
//import java.io.*;
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{
	Scanner sc= new Scanner(System.in);
	FileOutputStream fout=null;
	BufferedOutputStream bout = null;
	String[] Alll=null;
	 String s;
	 try {
     fout=new FileOutputStream("log//BufferedOutputStreamExample.txt");    
     bout=new BufferedOutputStream(fout);    
    
     s="Welcome to java   Tpoint."; 
     /*
     do {
    	 for(int i=0;i<=Alll.length;i++) {
    	 Alll[i]=sc.next();
    	 }
     }while(sc.hasNext());
     byte b[]=alll.getBytes();
     */ 
    // String str="null";
     //byte b[]=str.getBytes();
     byte b[]=s.getBytes();
     bout.write(b);    
     bout.flush();
	 }catch(Exception e) {
		 e.printStackTrace();
	 }finally {
		     
	     bout.close();    
	     fout.close();
	 }
     System.out.println("success");    
}    
}