import java.io.*;
import java.lang.*;
public class floydtriangle
{                   
  public static void main(String args[])
  {
 
   int p,q,x;
   x=Integer.parseInt(args[0]);
   System.out.print("the floyd triangle is...\n") ;
   for(p=0;p<=x;p++)
   {
    for(q=0;q<p;q++)
    {
    System.out.print("  *");
    
    

    }

    System.out.println("  ");
   }

  }
 



}
