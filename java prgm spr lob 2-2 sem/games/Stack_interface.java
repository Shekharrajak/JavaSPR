import java.util.Scanner;
interface st
{
void push(int x);
int seek();
int pop();
}
class Stack implements st
{
 int a[],top,size;
 Stack(){}
 Stack(int x)
	{
	size=x;
	a=new int[size];
	top=-1;
	}
 public int seek()
 {
   return top+1;
 }
 public void push(int x)
 {
	if(top<size-1)
	a[++top]=x;
	else
	System.out.println("Overflow");
 }
  public int pop()
 {
	if(top>=0)
	{	
          int x=a[top--];
          return x; 
	}
	else
	{
           return -1;
	}
 }
}
class Stack_interface
{
	public static void main(String args[])
	{
	int x,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Size of Stack");
	int s=sc.nextInt();
	Stack s1=new Stack(s);

int ch;
do{
    System.out.println("Enter \n1 for push\n2 for pop\n3 for no of element present\n4 exit");
    ch=sc.nextInt();
    switch(ch)
	{
        case 1:System.out.println("\nEnter the element\n");
		x=sc.nextInt();
		s1.push(x);
		break;
	case 2:System.out.println("\n"+s1.pop());
		break;
        case 3:System.out.println("\n no. of element="+s1.seek());
		break;
	case 4:
		break;
        default:System.out.println("\nenter valid choice\n");
	}
	}
	while(ch!=4);
}
}
