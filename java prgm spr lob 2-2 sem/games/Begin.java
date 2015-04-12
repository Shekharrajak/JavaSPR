import java.io.*;
import java.lang.*;
import java.util.*;

class nomatch extends Exception
{
 public String toString()
       {
        return "no match exception";
       }
}
class Begin
{
 public static void main(String args[])
 {
        int i;
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        char s1='u';
        try
        {
                if(s.charAt(0)==s1)
                        System.out.println("String Start with u");
                else
                        throw new nomatch();
        }
        catch(nomatch e)
        {
                System.out.println("Exception occurs");
        }

 }
}
