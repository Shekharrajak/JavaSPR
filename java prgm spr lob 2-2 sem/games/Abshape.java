import java.lang.*;
import java.util.*;
abstract class shape1
{
 double a1;
 double a2;

 shape1(double a,double b)
 {
  a1=a;
  a2=b;

 }
 abstract double area();
}


class rect extends shape1
{
 rect(double a,double b)
 {

  super(a,b);
 }
  double area()
  {
  System.out.print("\narea of rectangle is...\n");
  return a1*a2;


  }

}
class triangle extends shape1
{
 triangle(double a,double b)
 {
  super(a,b);

 }
  double area()
  {
   System.out.print("\narea of triangle is....\n");
   return (a1/a2)/2 ;
  }
}


class Abshape
{
 public static void main(String args[])
 {
  rect s=new rect(5,7);
  triangle t=new triangle(7,8);
  shape1 f;
  f=s;
  System.out.println("="+f.area());
  f=t;
  System.out.println("="+f.area());
  
 }
}
