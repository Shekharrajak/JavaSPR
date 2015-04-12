class Day
{
public static void main(String args[])
{
int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
switch(c){
case 1:
System.out.println("Sum="+(a+b));
break;
case 2:
System.out.println("Sub="+(a-b));
break;
case 3:
System.out.println("divide="+(a/b));
break;
case 4:
System.out.println("modulus="+(a%b));
default:
System.out.println("Enter value between 1-4");
}
}}