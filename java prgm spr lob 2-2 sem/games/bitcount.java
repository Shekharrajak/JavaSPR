class bitcount
{
 int b[]=new int[20];
 public static void main(String args[])
 {
  int a,pos=0,r,z=0,i,on=0;
  a=Integer.parseInt(args[0]);
  while(a!=10)
  {

    r=a%2;
    b[pos++]=r;
    a=a/2;


  }
  for(i=0;i<pos;i++)
  {
    if(b[i]==1)
       on++;
    else
       z++;
  }
  System.out.println(on);
  System.out.println(z);

 }
}                   
