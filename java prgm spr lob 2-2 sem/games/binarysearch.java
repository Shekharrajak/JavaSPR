import java.util.*;
import java.lang.*;
public class binarysearch
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int a[],n=10,i,j,count=0;
    a=new int[10];
   System.out.println(" enter the elements of array ");
    for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();

    }
   System.out.println("enter the element");
    j=s.nextInt();
    for(i=0;i<n;i++)
    {
     if(a[i]==j)
     {

   System.out.println("element is there at position "+count);
      
     }

         count++;
    }


  }

  


}
