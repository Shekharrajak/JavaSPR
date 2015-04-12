import java.util.*;
import java.io.*;
class stack
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
                int x=-1;
                if(v.isEmpty())
                System.out.println("stack is empty");
                if(!v.isEmpty())
                {
                        x=v.lastElement();
                        v.removeElementAt(top);
                        top--;
                }
                        return x;
                
         }
}
class dymcstack
{
 public static void main(String args[])throws IOException
 {
        Scanner sc=new Scanner(System.in);
        stack st=new stack();
        int i;
        System.out.println("enter the num of element:");
        int n=sc.nextInt();
        System.out.println("Push element into stack.....");
        for(i=1;i<=n;i++)
        {
                int x=sc.nextInt();
                st.push(x);
        }
       System.out.println("pop");
       for(i=1;i<=n;i++)
       System.out.println(st.pop());   
           
 }
}
          
