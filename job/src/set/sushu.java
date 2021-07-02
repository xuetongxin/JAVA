package set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class sushu{  
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
    	Set<Object> num=new TreeSet<Object>();
    	var n=sc.nextInt();
    	int i,j;
    	for(i=2;i<n;i++)
    	{
    		for(j=2;j<n;j++)
    		{
    			if(i%j==0)
    				break;
    		}
    		if(j>=i)
    			num.add(j);
    	}
    	
    	System.out.println(num);
    }
}