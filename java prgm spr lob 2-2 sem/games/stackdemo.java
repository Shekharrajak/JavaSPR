import java.io.*;
interface p
{
 void push(int item );
 int pop();
}
class stack implements p
{
        int st[]=new int[20];
        int top=-1;
        void push(int item)
        {
         if(top==19)
          System.out.println("stack full");
         else
          st[++top]=item;
        }
  int pop()
  {
   if(top==-1)
    System.out.println("empty stack");
   else
    return st[top--];

  }
}                      
class stackdemo
{
  public static void main(String args[])throws IOException
  {
   DataInputStream br=new DataInputStream(System.in);
     int item=Integer.parseInt(br.readLine());
     stack mystack=new stack();
     mystack.push(item);
     int k=mystack.pop();
     System.out.println("pop"+k);
  }

}
  
