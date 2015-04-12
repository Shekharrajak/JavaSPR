import java.util.Scanner;
class Stack
{
int a[],top;
Stack()
{
a=new int[10];
top=-1;
}
Stack(int x)
{
a=new int[x];
top=-1;
}
void push(int x)
{
if(top==9)
System.out.println("overflow");
else
a[++top]=x;
}
int pop()
{
if(top>=0)
{
int x;
x=a[top--];
return x;
}
else
System.out.println("Underflow");
return 0;
}
void merge(Stack s1,Stack s2)
{
for(int i=0;i<10;i++)
a[++top]=s1.pop();
for(int i=0;i<10;i++)
a[++top]=s2.pop();
}
}
class Stack_m
{
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
Stack s1=new Stack();
Stack s2=new Stack();
Stack s3=new Stack(20);
System.out.println("Stack 1");
for(int i=0;i<10;i++)
{
x=sc.nextInt();
s1.push(x);
}
for(int i=0;i<10;i++)
{
x=sc.nextInt();
s2.push(x);
}
s3.merge(s1,s2);
	for(int i=0;i<20;i++)
	{
	x=s3.pop();
	System.out.println("\n"+x);
	}
}
}