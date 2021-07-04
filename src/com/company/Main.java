package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,j,temp,n;
        n=sc.nextInt();
        int[] ch=new int [n];
        System.out.println("The number of array is:");
        System.out.println("Input the elements of array:");
        for(i=0;i<ch.length;i++) {
            ch[i]=sc.nextInt();
        }
        for(i=0;i<ch.length-1;i++)
            for(j=0;j<ch.length-i-1;j++) {
                if(ch[j]>ch[j+1]) {
                    temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        System.out.println("The sorted array is:");
        for(i=0;i<ch.length;i++)
            System.out.print(+ch[i]+" ");
    }
}
