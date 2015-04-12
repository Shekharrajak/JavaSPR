import java.lang.*;
import java.util.*;
public class complement
{
     public static void main(String args[]);
     Scanner s=new Scanner(System.in);
     int no,i;
     int a[]=new int[4];
     System.out.print("\n enter the no less than 15...\n");
     no=s.nextInt();
     for(i=3;i>=0;i--)
     {
      if(no%2==1)
      {
       
       a[i]=0;
      }
      else
         a[i]=1;
       no=no/2;

     }

      a[3]=a[3]+1;
     for(i=3;i>=0;i--)
     {
         if(a[i]==2)
         {
          a[i-1]==a[i-1]+1;
           a[i]=0;

         }

       System.out.print(a[i]);
     }


}
