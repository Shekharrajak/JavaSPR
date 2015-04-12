class inte
{
int a;
inte(int f)
{a=f;}
public int add(inte i)
{
return (i.a+a);
}
public int sub(inte i)
{
return (i.a-a);
}
public int div(inte i)
{
return (i.a/a);
}
public int mod(inte i)
{
return (i.a%a);
}
}
class Math_class
{
public static void main(String args[])
{
int a,b,c,d;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
d=Integer.parseInt(args[2]);
inte l=new inte(a);
inte m=new inte(b);

switch(d)
{
case 1:
c=m.add(l);
System.out.println("Sum="+c);
break;
case 2:
c=m.sub(l);
System.out.println("Substraction="+c);
break;
case 3:
c=m.div(l);
System.out.println("division="+c);
break;
case 4:
c=m.mod(l);
System.out.println("modulus="+c);
break;
}
}
}