class Bit_pos
{
public static void main(String args[])
{
int pos=0,r,n,a,s=0,i;
a=Integer.parseInt(args[0]);
int p=Integer.parseInt(args[1]);
int arr[]=new int[100];
while(a!=0)
{
r=a%10;
arr[pos++]=r;
a=a/10;
}

for(i=0;i<pos;i++)
{
if((pos-i)==p)
System.out.println("From front postion is "+arr[i]);
}
}
}