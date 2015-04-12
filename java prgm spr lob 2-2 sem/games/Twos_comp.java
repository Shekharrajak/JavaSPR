class Twos_comp
{
public static void main(String args[])
{
int c=0,a,r,s=0,flag=0;
a=Integer.parseInt(args[0]);
while(a!=0)
{
r=a%2;
if(r==1)
flag++;
	if(flag==0)
	s=s*10+r;
		else
		{
			if(flag==1)
			{
			s=s*10+r;
			flag++;
			}
				else
				{
					if(r==0)
					s=s*10+1;
					else
					s=s*10+0;
				}
		}
a/=2;
c++;
}
a=0;
while(s!=0)
{
r=s%10;
a=a+r*(int) Math.pow(2,c-1);
s/=10;
c--;
}

System.out.println(""+a);
}
}