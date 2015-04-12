class Reverse
{
public static void main(String args[])
{
int s=0,r,n;
n=Integer.parseInt(args[0]);
while(n!=0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
System.out.println("Reverse of the number="+s);
}
}
