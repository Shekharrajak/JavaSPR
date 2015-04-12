import java.io.*;
public class Switch
{
 public static void main(String ar[])
 {
  int a=10,b=20;
 switch(Integer.parseInt(ar[0]))
 {
   case 1:System.out.print(a+b);
   break;
   case 2:System.out.print(a-b);
   break;
   case 3:System.out.print(a*b);
   break;
   case 4:System.out.print(a/b);
   break;
   default:System.out.print("wrong output") ;
 }
}
}
