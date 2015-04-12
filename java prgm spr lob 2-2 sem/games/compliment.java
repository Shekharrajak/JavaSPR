import java.lang.*;
import java.util.*;
public class compliment
{
  public static void main(String args[])
  {
            int n,i=0,l=0,j,r,k,m=0;
            int a[]=new int[10];
            int b[]=new int[10];
            System.out.println("enter the num less than 15...");
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            while(n>0)
            {
                r=n%2;
                a[i++]=r;
                n=n/2;
            }
            for(j=i-1;j>=0;j--)
            {
                b[l++]=a[j];
            }
            for(j=i-1;j>=0;j--)
            {
                if(b[j]==1)
                {
                        m=j-1;
                        break;
                }
               for(k=m;k>=0;k--)
               {
                if(b[k]==1)
                 b[k]=0;
                else
                 b[k]=1;
               }
               for(j=0;j<i;j++)
               System.out.print(" "+b[j]);
            }
}
}
