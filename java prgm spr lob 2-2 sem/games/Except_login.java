import java.util.*;
import java.io.*;
import java.lang.*;
class Myexcept1 extends Exception
{
    public String toString()
   {
     return "illegal length";
   }

}
class Myexcept2 extends Exception
{
    public String toString()
   {
     return "illegal username";
   }

}
class Myexcept3 extends Exception
{
    public String toString()
   {
     return "illegal password";
   }

}


class Except_login
{
  public static void main(String args[])
  {     int i,count=1;
    String a=new String();
    String b=new String();
    Scanner sc=new Scanner(System.in);

   try {
        System.out.println("enter the user name\n");
        a=sc.nextLine();
        if(a.length()<10||a.length()>50)   
        throw new Myexcept1();
        for(i=0;i<=a.length();i++)
        {
         if((a.charAt(i)>=65&&a.charAt(i)<=90)||(a.charAt(i)>=97&&a.charAt(i)<=122)||(a.charAt(i)>=48||a.charAt(i)<=57))
         break;
         throw new Myexcept2();
        }
          System.out.println("enter the password\n");
          b=sc.nextLine();
          if(b.length()<4||b.length()>8)
          throw new Myexcept1();
          for(i=0;i<=b.length();i++)
           { 
            if(b.charAt(i)=='#'||b.charAt(i)=='@'||b.charAt(i)=='_'||b.charAt(i)=='$') 
            break;
            count++;
           }
         if(count==b.length())
          throw new Myexcept3();
        System.out.println("the username is   "+a);

        }
        catch (Myexcept1 e){System.out.println("caught " +e);}
        catch (Myexcept2 e){System.out.println("caught " +e);}
        catch (Myexcept3 e){System.out.println("caught " +e);}

}
}
