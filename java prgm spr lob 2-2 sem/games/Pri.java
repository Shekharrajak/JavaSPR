import java.util.*;
import java.lang.*;
import java.io.*;

class Pri
{
public static void main(String args[])
{
int i,j,k=0;
System.out.println("Prime no. from 1-100");
for(i=2;i<=100;i++)
{
	for(j=2;j<i;j++)
	{
	if(i%j==0)
	 k=1;
	}
	if(k==0)
	System.out.println("\n"+i);
	else
	k=0;

}
}
}
