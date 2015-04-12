import  java.io.*;
import java.lang.*;
import java.util.*;

class morebaldepositeexception extends Exception
{
	System.out.println("you can deposite more dan 20000");
}
class lessbalexception extends Exception
{
	
	System.out.println("bal is low");
}
class morebalwithdrawexception extends Exception
{
	
	System.out.println("you can withdrawl more dan 15000");
}
class Account
{
	int cbal;
	Accout(int x)
	{ c bal=y;}
	void deposite(int bal)throw morebaldepositeexception
	{
	 if(bal>25000)
	 {
		throw new morebaldepositeexception();
	 }
	 cbal=cbal+bal;

	}
	void withdraw(int bal)throw lessbalexception, morebalwithdrawexception
	{
		if(bal>10000)
			throw new morebalwithdrawexception();
		elseif(cbal-bal<=500)
		{
			throw new lessbalexception();
		}
		cbal=cbal-bal;
	}
	void balenquiry()
	{
		System.out.println("available bal="+cbal);

	}
}
class Accountdemo
{
	public static void main(String args[])throw morebaldepositeexception,throw lessbalexception,morebalwithdrawexception
	{
		Account a=new Account(Integer.parseInt(args[0]));
		System.out.println("1 for Deposite");
		System.out.println("2 for withdraw");
		System.out.println("3 for balenquiry");
		Scanner sc=new Scanner(System.in);
		int z=1;
		while(z!=0)
		{
			System.out.println("enter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:SYstem.out.println("Enetr the amount");
					a.deposite(sc.nextInt());
					break;
				case 2:SYstem.out.println("Enetr the amount");
					a.withdraw(sc.nextInt());
					break;
				case 3:SYstem.out.println("Enetr the amount");
					a.balenquiry(sc.nextInt());
					break;
				default:
					case 1:SYstem.out.println("wrong choice");
					
			}
			SYstem.out.println("for return press 0");
			z=sc.nextInt();
					
	}
	}
}


