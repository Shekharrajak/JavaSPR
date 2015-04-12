import java.awt.*;


import java.awt.event.*;
import java.util.Vector;
interface PinBallTarget 
{
	
public boolean intersects (Ball aBall);
	
public void moveTo (int x, int y);
	
public void paint (Graphics g);
	
public void hitBy (Ball aBall);

}


class Spring implements PinBallTarget 
{
	
private Rectangle pad;
	
private int state;
	
	
public Spring (int x, int y)
 {
		
pad = new Rectangle(x, y, 30, 3);

state = 1;
	
}
	
	
public void moveTo (int x, int y)
		
{ 
pad.setLocation(x, y); 
}

	
public void paint (Graphics g) 
{
		
int x = pad.x;
		
int y = pad.y;
		
g.setColor(Color.black);
		
if (state == 1) 
{
			
g.fillRect(x, y, pad.width, pad.height);
			
g.drawLine(x, y+3, x+30, y+5);
			
g.drawLine(x+30, y+5, x, y+7);
			
g.drawLine(x, y+7, x+30, y+9);
			
g.drawLine(x+30, y+9, x, y+11);
			
}
		
else 
{
			
g.fillRect(x, y-8, pad.width, pad.height);
			
g.drawLine(x, y+5, x+30, y-1);
			
g.drawLine(x+30, y-1, x, y+3);
			
g.drawLine(x, y+3, x+30, y+7);
			
g.drawLine(x+30, y+7, x, y+11);
			
state = 1;
		
}
	
}
	
	
public boolean intersects (Ball aBall)
		
{ 
return pad.intersects(aBall.location); 
}
	
	
public void hitBy (Ball aBall) 
{
			// make sure we are moving up
		
if (aBall.dy > 0)
			
aBall.dy = - aBall.dy;
			// give the ball a little boost
		
aBall.dy = aBall.dy - 0.5;
		
state = 2;
	
}

}


class Wall implements PinBallTarget 
{
	
public Rectangle location;
	
	
public Wall (int x, int y, int width, int height)
		
{ 
location = new Rectangle(x, y, width, height); 
}
	
	
public void moveTo (int x, int y)
		
{ 
location.setLocation (x, y); 
}

	
public void paint (Graphics g) 
{
		
g.setColor(Color.black);
		
g.fillRect(location.x, location.y, location.width, location.height); 
	
}
		
	
public boolean intersects (Ball aBall)
		
{ 
return location.intersects(aBall.location); 
}
	
	
public void hitBy (Ball aBall) 
{
		
if ((aBall.y() < location.y) || (aBall.y() > (location.y + location.height)))
	
aBall.dy = - aBall.dy;
		
else
			
aBall.dx = - aBall.dx;
	
}

}


class Hole extends Ball implements PinBallTarget 
{

	
public Hole (int x, int y) 
{
		
super (x, y, 12);
		
setColor (Color.black);
	
}
	
	
public boolean intersects (Ball aBall)
		
{ 
return location.intersects(aBall.location); 
}
		
	
public void hitBy (Ball aBall)
 {
			// move ball totally off frame
		
aBall.moveTo (0, PinBallGame.FrameHeight + 30);
			// stop motion
		
aBall.setMotion(0, 0);
	
}

}


class ScorePad extends Hole 
{
	
protected int value;
	
	
public ScorePad (int x, int y, int v) 
{
		
super (x, y);
		
value = v;
		
setColor (Color.red);
	
}
		
	
public void hitBy (Ball aBall) 
{
 PinBallGame.world.addScore(value); 
}
	
	
public void paint (Graphics g) 
{
		
g.setColor (color);
		
g.drawOval (location.x, location.y, location.width, location.height);
		
String s = "" + value;
		
g.drawString(s, location.x, y()+2);
	
}

}


class Peg extends ScorePad 
{
	
private int state = 1;
	
	
public Peg (int x, int y, int v)
 {
		
super(x, y, v);
		
setColor (Color.green);
	
}

	
public void paint (Graphics g)
 {
		
if (state == 2) 
{
			
setColor (Color.red);
			
g.drawOval(location.x-3, location.y-3, location.width+6, location.height+6);

state = 1;
			
}
		
else 
{
			
setColor (Color.green);
			
g.drawOval(location.x-2, location.y-2, location.width+4, location.height+4);
	
}
		
super.paint(g);
	
}
	
	
public void hitBy (Ball aBall) 
{
		
super.hitBy(aBall);
		
aBall.setMotion(-aBall.dy, -aBall.dx);
		
while (intersects(aBall))
			
aBall.move();
		
state = 2; // next draw will expand circle
	
}

}
