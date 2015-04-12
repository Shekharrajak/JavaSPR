public class airth
{
 public static void main(String args[])
 {int a,b,n,c;
  System.out.println("enter the num");
  a= Integer.parseInt(args[0]);
  b= Integer.parseInt(args[1]);
  System.out.println(a);
  System.out.println(b);
  n= Integer.parseInt(args[2]);
  System.out.println(n);
  switch(n)
  {
  case 1:c=a+b;
         System.out.println("the addition is"+c);
         break;
  case 2:c=a-b;
         System.out.println("the subtraction is"+c);
         break;
  case 3:c=a*b;
         System.out.println("the multiplication is"+c);
         break;
  case 4:c=a/b;
         System.out.println("the division is"+c);
         break;
  case 5:c=a%b;
         System.out.println("the modulus is"+c);
         break;
  default:System.out.println("wrong case entered");
          break;
 }
 }
}
