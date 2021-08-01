package xsl;
import java.util.Scanner;
public class jin{
	public static void main(String[] args){
		int i;
		int score=0;
		char scores[][]={{'A','B','B','C','A','D'},{'A','D','B','D','A','C'},{'B','D','D','C','B','D'},{'D','B','B','D','C','A'},{'C','C','A','B','A','D'},{'B','C','C','A','D','B'},{'C','A','A','B','D','C'},{'C','C','B','A','D','A'},{'D','A','C','B','A','D'},{'B','B','A','D','C','B'},{'A','B','A','D','C','A'}};
		try (Scanner input = new Scanner(System.in)) {
			int number=input.nextInt();
			System.out.println("The answers of number "+number+" is:");
			for(i=0;i<=5;i++){
				System.out.print(scores[number-1][i]+" ");
				if(scores[number-1][i]==scores[10][i])
					score++;
			}
		}
		System.out.println();
		System.out.print("Score is:"+score);
	}
}
	