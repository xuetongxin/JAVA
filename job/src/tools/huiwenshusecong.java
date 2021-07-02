package tools;
import java.util.Scanner;
public class huiwenshusecong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string:");
		String ch=sc.next();
		System.out.println(reverse(ch));
		System.out.println(isPalindrome(ch));
		System.out.println(filter(ch));
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
	static  char[]  filter(String ch ) {
		 char[] chars=ch.toCharArray();
		 return chars;
	 }

}
