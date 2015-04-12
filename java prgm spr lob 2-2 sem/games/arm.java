import java.util.*;
import java.io.*;
import java.lang.*;
class arm
{
public static void main(String args[])
{
int i,j,k,s=0,r,n;
System.out.println("Armstrong no. upto 1000");
for(i=2;i<=1000;i++)
{	n=i;
	while(n!=0)
	{
	r=n%10;
	s=(r*r*r)+s;
	n=n/10;
	}
	if(s==i)
	System.out.println("arm="+s);
	else
	s=0;
}
}
}
