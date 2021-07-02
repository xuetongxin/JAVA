package tools;
import java.util.Scanner;
public class MyIntArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		Array array=new Array(n);
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			array.add(num);
		} 
		int found=sc.nextInt();
		array.find(found);
		for(int i=0;i<10;i++) {
			int num=sc.nextInt();
			array.add(num);
		}
		array.print();
		array.sort();
		System.out.println();
		array.print();
	}

}
class Array{
	int[] arr;
	//int[] arr=new int[10];
	int cellNum=0;
	Array(int num){
		arr=new int[num];
	}
	Array(){
		
	}
	Array(int[] array ){
		this.arr=arr;
		this.cellNum=cellNum;
	}
	
	public void add(int num) {
		
		if(cellNum==arr.length) {
			int[] newarr=new int[arr.length+10];
			System.arraycopy(arr,0,newarr,0,arr.length);
			arr=newarr;
		}
		arr[cellNum]=num;
		cellNum++;
		
	}
	public void find(int num) {
		int y=0;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				y++;
			}
		}
		System.out.println(y);
	}
	
	public void sort() {
		int temp;
		for(int i=0;i<arr.length-1;i++) 
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>=arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
	}
	public void print() {
	for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}

