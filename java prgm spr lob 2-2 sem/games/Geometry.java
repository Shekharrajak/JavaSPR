import java.lang.*;
import java.util.*;
import static java.lang.Math.sqrt;
abstract class Gshape
{
	double l1,l2,l3;
	Gshape(double a,double b,double c)
	{l1=a;l2=b;l3=c;}
	abstract double area();
	abstract double perimeter();
	abstract void increase(double x);
	abstract void decrease(double y);
}

class Square extends Gshape
{
	Square(double a,double b,double c)
	{
		super(a,b,c);	
	}
	double area()
	{
		return (l1*l1);
	}
	double perimeter()
	{
		return (l1+l1);
	}
	void increase(double x)
	{
		l1=l1+(x/100)*l1;
		l2=l2+(x/100)*l2;
	}
	void decrease(double x)
	{
		l1=l1-(x/100)*l1;
		l2=l2-(x/100)*l2;
	}
	
}

class Rectangle extends Gshape
{
	Rectangle(double a,double b,double c)
	{
		super(a,b,c);
	}
	double area()
	{
		return (l1*l2);
	}
	double perimeter()
	{
		return (l1+l2);
	}

	void increase(double x)
	{
		l1=l1+(x/100)*l1;
		l2=l2+(x/100)*l2;
	}
	void decrease(double x)
	{
		l1=l1-(x/100)*l1;
		l2=l2-(x/100)*l2;
	}
	
}

class Triangle extends Gshape
{
	Triangle(double a,double b,double c)
	{
		super(a,b,c);
	}
	double area()
	{
		double s=(l1+l2+l3)/2;
		s=s*(s-l1)*(s-l2)*(s-l3);
		s=sqrt(s);
		return s;
	}
	double perimeter()
	{
		return (l1+l2+l3);
	}	

	void increase(double x)
	{
		l1=l1+(x/100)*l1;
		l2=l2+(x/100)*l2;
		l3=l3+(x/100)*l3;
	}
	void decrease(double x)
	{
		l1=l1-(x/100)*l1;
		l2=l2-(x/100)*l2;
		l3=l3-(x/100)*l3;
	}
	
}

class Circle extends Gshape
{
	Circle(double a,double b,double c)
	{
		super(a,b,c);
	}
	double area()
	{
		return (3.14*l1*l1);
	}
	double perimeter()
	{
		return (2*3.14*l1);
	}	

	void increase(double x)
	{
		l1=l1+(x/100)*l1;
	}
	void decrease(double x)
	{
		l1=l1-(x/100)*l1;
	}	

}

public class Shape
{
	Gshape g1;
	public static void main(String args[])
	{
		Square s=new Square(10,0,0);
		System.out.println("\nArea of square is : "+s.area());
		System.out.println("\nPerimeter of square is : "+s.perimeter());
		Rectangle r=new Rectangle(10,20,0);
		System.out.println("\nArea of rectangle is : "+r.area());
		System.out.println("\nPerimeter of rectangle is : "+r.perimeter());
		Triangle t=new Triangle(5,6,7);
		System.out.println("\nArea of triangle is : "+t.area());
		System.out.println("\nPerimeter of triangle is : "+t.perimeter());
		s.increase(50);
		System.out.println("\nIncreased Area of square is : "+s.area());
		System.out.println("\nIncreased Perimeter of square is : "+s.perimeter());
		s.decrease(50);
		System.out.println("\nDecreased Area of square is : "+s.area());
		System.out.println("\nDecreased Perimeter of square is : "+s.perimeter());
		r.increase(50);
		System.out.println("\nIncreased Area of rectangle is : "+r.area());
		System.out.println("\nIncreased Perimeter of rectangle is : "+r.perimeter());
		r.decrease(50);
		System.out.println("\nDecreased Area of rectangle is : "+r.area());
		System.out.println("\nDecreased Perimeter of rectangle is : "+r.perimeter());
		t.increase(50);
		System.out.println("\nIncreased Area of triangle is : "+t.area());
		System.out.println("\nIncreased Perimeter of triangle is : "+t.perimeter());
		t.decrease(50);
		System.out.println("\nDecreased Area of triangle is : "+t.area());
		System.out.println("\nDecreased Perimeter of triangle is : "+t.perimeter());
		Circle c=new Circle(5,0,0);
		System.out.println("\nPerimeter of square is : "+c.area());
		System.out.println("\nPerimeter of square is : "+c.perimeter());
		c.increase(50);
		System.out.println("\nIncreased Area of circle is : "+c.area());
		System.out.println("\nIncreased Perimeter of circle is : "+c.perimeter());
		c.decrease(50);
		System.out.println("\nDecreased Area of circle is : "+c.area());
		System.out.println("\nDecreased Perimeter of circle is : "+c.perimeter());
	}
}























































































































































































































































































































































































































































































































































