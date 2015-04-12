import java.util.*;
import java .lang.*;
class stacktest
{
   ArrayList v1;
   int s,top=-1;
   stacktest(ArrayList v,int x)
   {
     v1=v;
     s=x;
   }
void push(Integer x)
{
   if(top==(s-1))
    System.out.println("Stack is overlow\n");
    else
      {
       ++top;
       v1.add(top,x);
       }
 }
Integer pop()
{
  Integer item=-1;
  if(top!=-1)
    {
      item=(Integer)v1.get(top);
      v1.remove(top);
      top--;
    }
    else
     System.out.println("\nStack is underflow\n");
     return item;
}
void disp()
{
  int i;
  if(top==-1)
   System.out.println("\nStack is empty\n");
   else
   {
     for(i=top;i>=0;i--)
     System.out.println(v1.get(i));
   }
}
}
public class Astack
{
  public static void main(String args[])
  {
    int ch,c,k,h,g,x;
    System.out.println("Enter Size of ArrayList");
    Scanner sc=new Scanner(System.in);
    c=sc.nextInt();
    ArrayList v= new ArrayList(c);
    stacktest a=new stacktest(v,c);
    do
    {  System.out.println("Enter chocie\n1:push\n2:pop\n3:display\n");
        ch=sc.nextInt();
       switch(ch)
        {
           case 1:
                do
                  {
                    System.out.println("Enter element\n");
                    x=sc.nextInt();
                    a.push(x);
                    System.out.println("do u want to continue");
                    k=sc.nextInt();
                    }while(k==1);
                     break;
          case 2: Integer i=  a.pop();
                    if(i!=-1)
                      System.out.println("remove item is"+i);
                      break;
         case 3: System.out.println("after inserting\n");
                a.disp();
                break;
        }
          System.out.println("Do u want to continue switch \n");
          g=sc.nextInt();
  }while(g==1);
 }
}
