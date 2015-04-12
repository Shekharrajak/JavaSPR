import java.util.Scanner;
class Point 
{
 int x,y;
 Point()
 {
    x=0;
    y=0;
 }
 void getx(int a)
 {
  x=a;
 }
void gety(int b)
 {
  y=b;
 }
void getxy()
 {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y coordinate");
        x=sc.nextInt();
        y=sc.nextInt();
 }
}

class Line
{
     Point begin,ends;
     Line()
	{
         begin=new Point();
         ends=new Point();
	}
     void getbegin()
	{
         begin.getxy();
	}
     void getend()
	{
         ends.getxy();
	}
      float length()
	{
	float f;
	f=(float) Math.sqrt((ends.x*ends.x)-(begin.x*begin.x)+(ends.y*ends.y)-(begin.y*begin.y));
	return f;
	}
}
class Line_point
{
public static void main(String args[])
{
Line l=new Line();
l.getbegin();
l.getend();
float ff=l.length();
System.out.println("length="+ff);
}
}
