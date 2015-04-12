import java.util.*;
import java.lang.*;
class StackV
{
 int top=-1;
 Vector<Integer> v=new Vector<Integer>();
 void push(int x)
 {
  top++;
  v.addElement(x);
 }
 int pop()
 {
  int x=0;
  x=v.lastElement();
  v.removeElementAt(top);
  top--;
  return x;
 }
 void display()
 {
  System.out.print("\n\n Stack is.......\n\n");
  for(int j=top;j>=0;j--)
   System.out.print(v.elementAt(j)+"\n\n");
 }
};
class Vectorstack
{
 public static void main(String args[])
 {
  StackV obj=new StackV();
  Scanner sc=new Scanner(System.in);         
  System.out.print("\n\n Enter the number of elements.....\n\n");
  int n=sc.nextInt();
  System.out.print("\n\n Enter the Elements........\n\n");
  for(int i=0;i<n;i++)
  {
   int y=sc.nextInt();
   obj.push(y);
  }
  obj.display();
  int ch=0;
  System.out.print("\n\n Enter '1' if u want to pop.......");
  ch=sc.nextInt();
  if(ch==1)
  {
  System.out.print("\n\n Poping......."+obj.pop()+"\n\n");
  obj.display();
  }
 } 
}
