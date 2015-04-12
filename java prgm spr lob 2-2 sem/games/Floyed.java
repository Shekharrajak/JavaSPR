class Floyed
{
public static void main(String args[])
{
int a,c=1;
a=Integer.parseInt(args[0]);
for(int i=1;c<=a;i++)
{
 for(int j=1;j<i;j++)
	System.out.print(""+(c++));
System.out.println("");
}
}
}
