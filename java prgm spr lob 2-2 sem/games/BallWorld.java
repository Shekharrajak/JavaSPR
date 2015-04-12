import java.awy.*;
import java.util.*;
class Ball
{
        protected Color color;
        protected int x,y,h,w;
        public Ball(int a,int b,int c)
        {
                x=a;
                y=b;
                h=c;
                w=c;
                color=Color.red;


        }
        public void paint(Graphics g)
        {
                g.setColor(color);
                g.fillOval(x,y,h,w);

        }
}

public class BallWorld extends Frame
{
        int x,y,r;
        Ball aBall,tBall;
        Scanner sc=new Scanner(System.in);
        private BallWorld()
        {
                System.out.println("enert the location");
                x=sc.nextInt();

                  y=sc.nextInt(); 
		 r=sc.nextInt();
                  aBall=new Ball(x,y,2*r);
                  setSize(600,600);
                  setTitle("BallWorld");
 		x=sc.nextInt();
		System.out.println(" ");
                  y=sc.nextInt(); 
		 r=sc.nextInt();
                  tBall=new Ball(x,y,2*r);
                  setSize(600,600);
                  setTitle("BallWorld");

        }
        public void paint(Graphics g)
        {
                aBall.paint(g);
                tBall.paint(g);

        }
        public static void main(String args[])
        {
                BallWorld w=new BallWorld();
                w.setBackground(Color.black);
                w.setVisible(true);
        }
}
