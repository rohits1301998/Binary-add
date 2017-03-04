package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int carry=0,sum;
        System.out.println("Enter two 4-Bit Binary numbers:");
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int a[]=new int[5];
        for(int i=a.length-1;i>=0;i--)
        {
          int x=n1%10;
          int y=n2%10;
          n1=n1/10;
          n2=n2/10;
          sum=x+y+carry;
          if(sum==1){
              a[i]=sum;carry=0;}
          else if(sum==2)
          {
              a[i]=0;
              carry=1;
          }
          else if(sum==3)
          {
              a[i]=1;
              carry=1;
          }
          else {
              a[i] = x + y + carry;carry=0;
          }
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);

    }
}

