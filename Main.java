

import java.util.Scanner;

public class NewClass1
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int carry=0,sum;
        System.out.println("Enter two Binary numbers:");
        String s1=Sc.next();
        String s2=Sc.next();
        int n1=Integer.parseInt(s1);
        int n2=Integer.parseInt(s2);
        int a[]=new int[s1.length()+1];
        for(int i=a.length-1;i>=1;i--)
        {
          int x=n1%10;
          int y=n2%10;
          n1=n1/10;
          n2=n2/10;
          sum=x+y+carry;
          if(sum==2)
          {
              a[i]=0;
              carry=1;
          }
          else if(sum==3)
          {
              a[i]=1;
              carry=1;
          }
          else{
              a[i]=sum;
              carry=0;
          }
        }
        a[0]=carry;
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);

    }
}

