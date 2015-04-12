

import java.awt.*;



public class PinBall extends Ball
 {
	
	
public PinBall (int sx, int sy) 
	
{
		
super(sx, sy, 10);
			// start out moving (roughly) vertical
		
setMotion (-2 + Math.random()/4, -15);
	
}

	
private double gravityEffect = 0.3;

	
public void move ()
	
{
		
dy = dy + gravityEffect; // effect of gravity
		
super.move();	// update the ball position
	
}

}
