package tools;
import java.util.Scanner;
public class huiwenshu  {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String string=sc.next();
	System.out.print("enter a string:");
	String temp;
	temp=string;
	String S=reverse(string);
	System.out.println("reverse is:"+S);
	System.out.println("ispalindrome:"+isPalindrome(temp));
	
	}
public static String reverse(String str) {
		//return new StringBuilder(s).reverse().toString();
		StringBuilder string=new StringBuilder(str);
		string.reverse();
		return string.toString();
}
 static boolean isPalindrome(String s ) {
	 		String S=reverse( s);
			if(s.equals(S)) {
				return true;
			}
			else
				return false;
		
	}

}