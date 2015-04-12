public class greatst
{
        public static void main(String args[])
        {
         int a,b,c;
         System.out.println("enter the three num");
         a= Integer.parseInt(args[0]);
         b= Integer.parseInt(args[1]);
         c= Integer.parseInt(args[2]);
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         if(a>b && a>c)
         {
          System.out.println("the greatest num is a");
         }
         else
         {
          if(b>a && b>c)
          {
           System.out.println("the greatest num is b");
          }
          else
          {
           System.out.println("the greatest num is c");
          }
           
      
         }
        }
}
