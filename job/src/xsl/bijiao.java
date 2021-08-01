package xsl;
import java.util.Scanner;
public class bijiao {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("");
		int i,max,min;
		int[] ch=new int[10];
		for(i=0;i<10;i++) {
			System.out.print("enter int"+" "+(i+1)+":");
			  ch[i]= input.nextInt();
		}
		max=ch[0];
		min=ch[0];
		for(i=1;i<10;i++) {
			if(max<ch[i]) {
				max=ch[i];
			}                                                                                            
			if(min>ch[i]) {
				min=ch[i];
			
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

	}

}
