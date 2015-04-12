import java.util.*;
import java.io.*;
import java.lang.*;


class V_Array
{
   Vector v1;
   V_Array(Vector v)
  {

    v1=v;
  }
 
 
 void max()
 {
   int temp=0,i;
   for(i=0;i<(int)v1.size();i++)
    {
      if((int)v1.elementAt(i)>temp)
        {
           temp=(int)v1.elementAt(i);
        }


    }
   System.out.println("\nmaximum is"+temp);
 
 }
 void min()
 {

   int temp=(int)v1.elementAt(0),i,j;
   for(i=0;i<(int)v1.size();i++)
    {
      if((int)v1.elementAt(i)<temp)
        {
           temp=(int)v1.elementAt(i);
        }


    }
   System.out.println("\nminimum is"+temp);

 }
 void swap(int i,int j)
 {
    
   Integer temp=(Integer)v1.elementAt(i);
   Integer temp1=(Integer)v1.elementAt(j);
    v1.setElementAt(temp1, i);
    v1.setElementAt(temp, j);

 }

 void rev()
 {



 }


}


public class Vectordemo
 {
   public static void main(String args[])
  {
   int i,j,ch;
   Scanner s=new Scanner(System.in);
   Vector v=new Vector(10);
   System.out.println("the size of vector is:"+v.size());
   System.out.println("\nthe capacity of vector is:"+v.capacity());
   
   do{
      System.out.println("\nenter the element");
      j=s.nextInt();
      v.addElement(new Integer(j));
      System.out.println("\npress 1 if u want to insert..");
      ch=s.nextInt();

   }while(ch==1);
   
   System.out.println("\nthe size of new vector is:"+v.size());
   System.out.println("\nthe capacity of new vector is:"+v.capacity());


   V_Array a=new V_Array(v);
   a.min();
   a.max();
   a.swap(1,3);
   Enumeration v1Enum=v1.elements();
   System.out.println("elements of array are...\n");
   while(v1Enum.hasMoreElements())
    System.out.print(v1Enum.nextElement()+" ");

  }
 }


