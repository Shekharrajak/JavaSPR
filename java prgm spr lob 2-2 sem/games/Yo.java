import java.awt.*;
public class Yo extends Frame
{
 double x,y;
 int dx,dy;
 int count=0;
 Yo()
 {
  x=y=40;
 }
 public void paint(Graphics g)
 {
  dx=(int)x;
  dy=(int)y;
  g.setColor(Color.white);
  g.fillOval(dx,dy,30,30);

  if(count<=900)
  {
   count++;
   x=x+1.0;
   y=y+1.0;
   repaint();
  }

  if((count>900)&&(count<1700))
  {
   count++;
   x=x-1.0;
   repaint();
  }

  if((count>=1700)&&(count<2500))
  {
   count++;
   x=x+1.0;
   y=y-1.0;
   repaint();
  }

  if((count>=2500)&&(count<3200))
  {
   count++;
   x=x-1.0;
   repaint();
  }

 }
 public static void main(String args[])
 {
  Frame f=new Yo();
  f.setBackground(Color.gray);
  f.setVisible(true);
  f.setSize(1000,1000);
 }
}
