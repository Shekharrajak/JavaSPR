import java.util.*;
import java.io.*;
public class Happy
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Input an Integer");
                int n=sc.nextInt();
                int num=n;
                int count=0;
                int sumsquare=0;
                int digit=0;
                while(count<100)
                {
                        count++;
                        digit=num%10;
                        num=num/10;
                        count++;
                        digit=digit*digit;
                        num=num*num;
                        count++;
                        sumsquare=digit+num;
                        n=sumsquare;
                        System.out.print(" "+num);
                 
                }
                if(num<=0)
                {
                        System.out.println("Happy Num");
                }
                else
                {
                        System.out.println("Unhappy Num");
                }
        }
}
