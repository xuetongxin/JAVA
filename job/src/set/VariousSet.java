package set;

import java.util.TreeSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class VariousSet {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Set<Object> set=new TreeSet<Object>();
		Set<Object> set1=new LinkedHashSet<Object>();
		Set<Object> set2=new HashSet<Object>();
		
		int[] a={1,2,3,4,5,6};
		int[] b={4,5,6,7,8};
		for(int i=0;i<a.length;i++) {	
			set.add(a[i]);
			}
		for(Object i:b) {
			set.add(i);
		}
		/*
		for(int i=0;i<a.length;i++) {	
			set1.add(a[i]);
			}
			*/
		for(int i:b) {
			//set.retain(i);
		}
		for(int i=0;i<a.length;i++) {	
			set1.add(a[i]);
			}
		for(Object i:b) {
			set1.remove(i);
		}
		
		System.out.println(set+""+set1+""+set2);
	}

}
