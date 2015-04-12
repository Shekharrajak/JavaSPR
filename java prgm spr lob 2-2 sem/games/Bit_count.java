class Bit_count
{
public static void main(String args[])
{
int a,pos=0,r,z=0,o=0;
a=Integer.parseInt(args[0]);
while(a!=0)
{
r=a%10;
if(r==1)
o++;
else
z++;
a=a/10;
}
System.out.println("no of zero's "+z+"\nno of one's"+o);
}
}