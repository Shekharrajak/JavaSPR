 import java.io.*;
 class quadratic {
     public static void main(String args[])throws IOException {
         InputStreamReader read=new InputStreamReader (System.in);
         BufferedReader in=new BufferedReader (read);
         System.out.println("a="); 
         int a=Integer.parseInt(in.readLine());
         System.out.println("b="); int b=Integer.parseInt(in.readLine()); 
         System.out.println("c="); int c=Integer.parseInt(in.readLine()); 
         double dis = Math.sqrt(b*b-4*a*c); 
         double c1=(-b+dis)/(2*a);
         double c2=(+b+dis)/(2*a);
         System.out.println("Either "+c1+"or"+c2); 
     }
 } 