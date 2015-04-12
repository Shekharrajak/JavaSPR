import java.util.*;
import java.io.*;
import java.lang.*;

class MyException extends Exception
{
public  MyException()
  {
	System.out.println("enterstring between 4-8 character");
  }
}
class Rightstring
{
	public static void main(String args[])throws MyException
	{
		String s=new String();
                Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		s=sc.nextLine();
		try
		{
                        if(s.length()<4 || s.length()>8)
			{
				throw new MyException();
			}
			else
			{
				System.out.println("string is perfect");
			}		
		}	
		catch(MyException e)
		{
			System.out.println("exception occurs");
		}	
	}
}
