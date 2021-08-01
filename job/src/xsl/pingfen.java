package xsl;
import java.util.Scanner;
public class pingfen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0,average;
		int n=sc.nextInt();
		double[] num=new double[n];
		
		for(int i=0;i<n;i++) {
			num[i]=sc.nextDouble();
			sum+=num[i];
		}
		double max=num[0],min=num[0];
		for(int i=1;i<num.length;i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		
		average=(sum-max-min)/(n-2);
		
		System.out.print("average score:");
		//System.out.print(String.format("%.2f",average));
		System.out.printf("%.2f", average);
	}

}
