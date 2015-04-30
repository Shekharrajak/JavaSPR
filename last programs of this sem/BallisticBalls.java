   /* 
       This applet shows an animation of red balls moving on a black
       background.  The balls "bounce" off the sides of the applet.
       The number of balls can be set as the value of an applet
       param with name "ballCount".  The default number is 25.
       The number of milliseconds can be set as the value of an
       applet parameter with name "frameTime".  The default is 
       100 milliseconds.  A value of 50 milliseconds will give
       a nicer speed.
       
       If the user clicks on the applet, or drags the mouse on
       the applet, all the balls head towards the mouse location.
       
       The "balls" are represented by objects of type MovingBall.
       This applet depends on the MovingBall class and on the
       SimpleAnimationApplet, which it extends.
    */
    
    import java.awt.*;
    import java.awt.event.*;
    import java.applet.Applet;
    
    public class BallisticBalls extends SimpleAnimationApplet
                    implements MouseListener, MouseMotionListener {
    
       MovingBall[] balls;  // An array to hold the balls.
    
    
       public void init() {
              // Initialize the applet.  The applet listens for
              // mouse events on itself.  The balls are created.
              // The number of balls and number of milliseconds 
              // per frame are set from applet parameters (or to
              // default values).
              
          addMouseListener(this);
          addMouseMotionListener(this);
          
          setMillisecondsPerFrame( getIntParam("frameTime", 100) );
          
          /* Create an array to hold the balls, then create the balls. */
          
          int ballCt = getIntParam("ballCount", 25); // How many balls?
          balls = new MovingBall[ ballCt ];  // Create the array
          for (int i = 0; i < balls.length; i++) {
               // Create each of the ball objects.  The parameters specify
               // that the balls are restricted to moving within the bounds
               // of the applet.
             balls[i] = new MovingBall(0, getSize().width, 0, getSize().height);
          }
          
       } // end init()
       
       
       private int getIntParam(String paramName, int defaultValue) {
            // Get a non-negative integer applet parameter.  This routine
            // will read an applet param with the name paramName.
            // If the param has a value that is a POSITIVE integer,
            // then that value is returned.  Otherwise, the defaultValue
            // is returned.
            
          String param = getParameter(paramName); // Get param, if any.
                                                  // (If there is none, then
                                                  // the value is null.)
          if (param != null) {
             try {
                    // Try to convert the parameter string to an int.
                int N = Integer.parseInt(param);
                if (N > 0)  // Return the integer only if it is > 0.
                   return N;
             }
             catch (NumberFormatException e) {
                 // The param value is not a legal integer.
             }
          }
          
          // If we get here, then the param did not exist in the <applet> tag
          // or was not a legal integer, or was <= 0.  So, return the 
          // default value that was specified in the function call.
          
          return defaultValue;
          
       } // end getIntParam
       
    
       public void drawFrame(Graphics g) {
              // This method is called by the SimpleAnimationApplet framework
              // to compute and draw the next frame in the animation.  The
              // applet is filled with black.  Then the balls are moved and
              // drawn.
              
          g.setColor(Color.black);  // Fill the applet with a black background.
          g.fillRect(0, 0, getSize().width, getSize().height);
          
          /* Tell each ball to move.  It moves an amount depending on
             its current direction and speed, and it will "bounce" off the
             side of the applet if necessary.  Then the ball is told
             to draw itself in the graphics context g.
          */
          
          for (int i = 0; i < balls.length; i++) {
             balls[i].travel();
             balls[i].draw(g);
          }
          
       } // end drawFrame()
    
    
       public void mousePressed(MouseEvent evt) { 
             // The user has clicked on the applet.  Tell all the
             // balls to head towards the location of the mouse.
          for (int i = 0; i < balls.length; i++)
             balls[i].headTowards(evt.getX(), evt.getY());
       }
       
    
       public void mouseDragged(MouseEvent evt) { 
             // The user has dragged the mouse on the applet.  Tell all
             // the balls to head towards the location of the mouse.
          for (int i = 0; i < balls.length; i++)
             balls[i].headTowards(evt.getX(), evt.getY());
       }
    
    
       public void mouseReleased(MouseEvent evt) { }
       public void mouseMoved(MouseEvent evt) { }
       public void mouseClicked(MouseEvent evt) { }
       public void mouseEntered(MouseEvent evt) { }
       public void mouseExited(MouseEvent evt) { }
    
    
    }  // end class BallisticBalls
