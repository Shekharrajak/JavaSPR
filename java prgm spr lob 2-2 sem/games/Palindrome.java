class Palindrome
{
public static void main(String args[])
{
int s=0,r,n,k;
n=Integer.parseInt(args[0]);
k=n;
while(n!=0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
if(k==s)
System.out.println("Palindrome number");
else
System.out.println("Not a palindrom number");
}
}
