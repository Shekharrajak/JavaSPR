import java.util.*;
import java.math.*;
class  LASTDIG
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;i<a;i++)
        {
            BigInteger a1 = new BigInteger(in.next());
            BigInteger  a2= new BigInteger(in.next());
            BigInteger res = a1.pow(a2.intValue());
           int r =res.intValue()%10;
            System.out.println(r);
           
        }
    }
}