public class numpyramd
{
  public static void main(String args[])
  {
        int i,j,a=1,x;
        x=Integer.parseInt(args[0]);
        System.out.println("Pyramid is");
        for(i=1;i<x;i++)
        {  
                for(j=1;j<=i;j++)
                {
                        System.out.print(" "+a);
                        a++;

                }
                System.out.println("  ");
        }

  }

}


