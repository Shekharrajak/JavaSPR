import java.util.*;
import java.util.scanner;
class array
{
        void display(Vector<integer> v)
        {
                Enumeration e=v.element();
                System.out.println("display element");
                while(e.hasMoreElement)
                System.out.println(e.nextElement());
        }

        int min()
        {
                int x=v.FirstElement();
                for(int i=0;i<v.size();i++)
                {
                        if(x>v.ElementAt(i))
                        x=v.ElementAt(i);
                }
                return x;
}
        int max(Vector<Integer> v)
        {
                int x=v.FirstElement();
                for(int i=0;i<v.size();i++)
                {
                        if(x<v.ElementAt(i))
                        x=v.ElementAt(i);
                }
                return x;
} 
        void swap(Vector<Ineger> v,int i1,int i2)
        {
                if(i1<v.size() && i2<)
                {
                        int x=v.elementAt(i1);
                        v.SetElementAt(v.elementAt(i2),i1);
                        v.SetElementAt(x,i2);
                 }
                 else
                 {
                        System.out.println("out of bound");
                 }
                
        }
        void space(Vector v)
        {
                if(v.size()<v.capacity())
                {
                        System.out.println("space available");
                }
                else
                {
                        System.out.println("space not available");
                }
        }
        void occerence(Vector<Integer>)
        Vector<Integer> v2=new vector<Integer>());
        v2=(Vector) v.clone();
        int i,j,count;
        for(i=0;i<v2.size;i++)
        {
                count=1;
                for(j=i+1;i<v2.size();i++)
                {
                        if(v2.ElementAt[i]==v2.elementAt(j))
                        {

                        }
                }

        }

public class vector
{
  public static void main(String args[])
  {
          Scanner s=new Scanner(System.in);
          Vector<Integer> v=new Vector<Integer>();
  
          for(int i=1;i<10;i++)
          {
           int b=s.nextInt();
           v.addElement(b);
          }
          Enumeration<Integer> vEnum = v.elements();
          System.out.println("\n\n element in vector are :\n");
          while(vEnum.hasMoreElements())
                System.out.println( vEnum.nextElement() + " ");
          System.out.println();
          demo obj=new demo(v);
          obj.max();
    
