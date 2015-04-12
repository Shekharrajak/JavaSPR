import java.util.Scanner;
class Binary
{
public static void main(String args[]) throws java.io.IOException
{
Scanner sc=new Scanner(System.in);
int i,j,k,mid,high=9,low=0;

int a[]=new int[10];

for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter no to search");
k=sc.nextInt();

mid=(low+high)/2;

while(low<=high)
{
	if(k<a[mid])
	high=mid-1;
	else
	{
		if(k>a[mid])
		{
		low=mid+1;
		}
	  else 
	  {
			if(k==a[mid])
	 	         { 
	
			break;
	    	         } 	
	  }	  
 	}
mid=(low+high)/2;
}
if(k==a[mid])
System.out.println("no is found");
else
System.out.println("no is not found");

}
}
