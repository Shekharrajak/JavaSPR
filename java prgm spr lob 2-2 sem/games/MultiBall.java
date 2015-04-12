import java.awt.*;
import java.util.*;
import javax.swing.*;

class Ball
{
 protected Rectangle location;
 protected double dx,dy;
 protected Color color;
 
 public Ball(int x,int y,int r)
 {
  location=new Rectangle(x-r,y-r,2*r,2*r);
  dx=0;
  dy=0;
  color=Color.blue;
 }

 public void setColor(Color newcolor)
 {
  color=newcolor;
 }

 public void setMotion(double ndx,double ndy)
 {
  dx=ndx;
  dy=ndy;
 }

 public int radius()
 {
  return location.width/2;
 }

 public int x()
 {
  return location.x+radius();
 }

 public int y()
 {
  return location.y+radius();
 }

 public double xMotion()
 {
  return dx;
 }

 public double yMotion()
 {
  return dy;
 }

 public Rectangle region()
 {
  return location;
 }

 public void moveTo()
 {
  location.setLocation((int)dx,(int)dy);
 }
 public void paint(Graphics g)
 {
  g.setColor(color);
  g.fillOval(location.x,location.y,location.width,location.height);
 }
 public void move()
 {
  location.translate((int)dx,(int)dy);
 }
}
public class MultiBall extends Frame
{
 private static final int FrameWidth=500;
 private static final int FrameHeight=550;
 private Ball [] ballArray;
 private static final int BallArraySize=3;
 private int counter=0;

 private MultiBall(Color ballcolor)
 {
  setSize (FrameWidth,FrameHeight);
  setTitle("MULTIPLE BALL");
  ballArray=new Ball [BallArraySize];
  for(int i=0;i<BallArraySize;i++)
  {
   ballArray[i]=new Ball(10,15,10);
   ballArray[i].setColor(ballcolor);
   ballArray[i].setMotion(3.0+i,6.0-i);
  }
 }

 public void paint(Graphics g)
 {
  for(int i=0;i<BallArraySize;i++)
  {
   ballArray[i].paint(g);
   ballArray[i].move();
   if((ballArray[i].x()<0||ballArray[i].x()>FrameWidth))
     ballArray[i].setMotion (-ballArray[i].xMotion(),ballArray[i].yMotion());
   if((ballArray[i].y()<0||ballArray[i].y()>FrameWidth))
     ballArray[i].setMotion (ballArray[i].xMotion(), -ballArray[i].yMotion());
  }
   counter=counter+1;
   if(counter<4000)
    repaint();
 }
 public static void main(String []a)
 {
  MultiBall world=new MultiBall(Color.white);
  world.setBackground(Color.blue);
  world.setVisible(true);
 }
}
