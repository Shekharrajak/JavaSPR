

import java.awt.*;

import java.awt.event.*;

import java.util.Vector;


public class PinBallGame extends Frame 
{

	
public static void main (String [ ] args) 
{
		
world = new PinBallGame();
		
world.show();
	
}

	
public static final int FrameWidth = 400;
	
public static final int FrameHeight = 400;
	
public static PinBallGame world;
	
private Vector balls;
	
private int score = 0;
	
private Label scoreLabel;
	
private Vector targets;

	
public PinBallGame () 
{
		
setTitle ("Pin Ball Construction Kit");
		
setSize (FrameWidth, FrameHeight);

		
balls = new Vector();
		
scoreLabel = new Label ("score: 0");
		
add ("North", scoreLabel);
		
addMouseListener (new MouseKeeper());
			// create the targets 
		
targets = new Vector();
		
targets.addElement(new Wall(30, 50, 2, 350));
		
targets.addElement(new Wall(30, 50, 360, 2));
		
targets.addElement(new Wall(390, 50, 2, 380));
		
targets.addElement(new Hole(100, 100));
		
targets.addElement(new ScorePad(150, 220, 100));
		
targets.addElement(new Peg(300, 140, 200));
		
targets.addElement(new Spring(120, 350));
		
targets.addElement(new Spring(200, 350));
		
targets.addElement(new Spring(280, 350));
	
}

	
private class PinBallThread extends Thread 
{
		
private Ball theBall;

		
public PinBallThread (Ball aBall) 
{
			
theBall = aBall; 
		
}

		
public void run () 
{
			
while (theBall.y() < FrameHeight)
 {
				
theBall.move ();
					// see if we ran into anything

for (int j = 0; j < targets.size(); j++)
 {
					
PinBallTarget target = (PinBallTarget) targets.elementAt(j);

if (target.intersects(theBall)) target.hitBy(theBall);
					
}
				
repaint();
					// then sleep for a while

try 
{
					
sleep(10);
				
}
 catch (InterruptedException e) 
{
 System.exit(0);
 }
			
}
		
}
	
}

	
private class MouseKeeper extends MouseAdapter
 {

		
public void mousePressed (MouseEvent e) 
{ 
			
int x = e.getX();
			
int y = e.getY();
			
if ((x > FrameWidth-40) && (y > FrameHeight -40)) 
{
				
PinBall newBall = new PinBall(e.getX(), e.getY());
				
balls.addElement (newBall);
				
Thread newThread = new PinBallThread (newBall);
				
newThread.start();
			
}
		
}
	
}

	
synchronized public void addScore (int v) 
{ 
		
score = score + v; 
		
scoreLabel.setText("score = " + score); 
		
}

	
public void paint (Graphics g)
 {
		
g.setColor (Color.white);
		
g.fillRect (FrameWidth-40, FrameHeight-40, 30, 30);
		
g.setColor (Color.red);
		
g.fillOval (FrameWidth-40, FrameHeight-40, 30, 30);
			// draw balls
	
for (int i = 0; i < balls.size(); i++)
 {
			
Ball aBall = (Ball) balls.elementAt(i);
			
aBall.paint(g);
			}
			// draw targets
		
for (int j = 0; j < targets.size(); j++)
 {
			
PinBallTarget target = (PinBallTarget) targets.elementAt(j);
			
target.paint(g);
			
}	
		
}

}
