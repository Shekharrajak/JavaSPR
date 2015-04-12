class inte
{
int a;
inte(int f)
{a=f;}
public int add(inte i)
{
return (i.a+a);
}
}
class Cl
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
inte l=new inte(a);
inte m=new inte(b);
c=l.add(m);
System.out.println("Sum="+c);
}
}
