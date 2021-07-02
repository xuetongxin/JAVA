package set;

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter names(separated by , ):");
			String input1=sc.nextLine();
			String[] s1 = input1.split(",");
			Set<String> a=new TreeSet<String>();
			for(String S1:s1) {
				a.add(S1);
			}
			System.out.println("your enter:"+a);
			
			System.out.print("enter names(separated by , ):");
			String input2=sc.nextLine();
			String[] s2 = input2.split(",");
			Set<String> b=new TreeSet<String>();
			for(String S2:s2) {
				b.add(S2);
			}
			System.out.println("your enter:"+b);
			
			// To find intersection
			Set<String> intersection = new TreeSet<String>(a);
			intersection.retainAll(b);
			System.out.print("and:");
			System.out.println(intersection);
			
			// To find union
			Set<String> union = new TreeSet<String>(a);
			union.addAll(b);
			System.out.print("or:");
			System.out.println(union);

			// To find the symmetric difference
			union.removeAll(intersection );
			System.out.print("diff:");
			System.out.println(union);
		}

	}

}
