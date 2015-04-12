import java.io.*;
 interface p
{
 void push(int item);
 int pop();
}
class stackdemo implements p
{
        int st[]=new int[20];
        int top=-1;
        public void push(int item)
        {
         if(top==19)
          System.out.println("stack full");
         else
          st[++top]=item;
        }
        public int pop()
        {
         if(top==-1)
         {
           System.out.println("empty stack"); return 0;
         }
        else
        return st[top--];
        }
}                       
class stack
{
  public static void main(String args[])throws IOException
  {
   DataInputStream br=new DataInputStream(System.in);
     int item=Integer.parseInt(br.readLine());
     stackdemo a=new stackdemo();
     a.push(item);
     int k=a.pop();
     System.out.println("pop"+k);
  }          

}
  
