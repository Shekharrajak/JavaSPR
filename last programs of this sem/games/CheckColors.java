//Scrollbar and Color Example
import java.awt.*; 
import java.applet.Applet; 
import java.awt.event.*;

/* Class that creates three scroll bars.  Each controls a different color (red, green, or blue).  These are mixed together and displayed on a canvas. */ 
public class CheckColors extends Applet 
{ 
     private TextField colorValues = new TextField (30); 
     private Scrollbar red, green, blue; 
     private Label redLabel, greenLabel, blueLabel; 
     private Canvas canvas = new Canvas (); 
     private Panel southPanel = new Panel (); 
     private int r, g, b;

    public void init () 
    { 
        red = new Scrollbar (Scrollbar.HORIZONTAL, 0,5, 0, 255); 
        redLabel = new Label ("Red", Label.RIGHT); 
        red.addAdjustmentListener (new ScrollbarListener (0));

        green = new Scrollbar (Scrollbar.HORIZONTAL, 0, 1, 0, 255); 
        greenLabel = new Label ("Green", Label.RIGHT); 
        green.addAdjustmentListener (new ScrollbarListener (1));

        blue = new Scrollbar (Scrollbar.HORIZONTAL, 0, 1, 0, 255); 
        blueLabel = new Label ("Blue", Label.RIGHT); 
        blue.addAdjustmentListener (new ScrollbarListener (2));

        setLayout (new BorderLayout ()); 
        canvas.setBackground (Color.cyan); 
        add (canvas, "Center");

        southPanel.setLayout (new GridLayout (3, 2, 10, 10));

        southPanel.add (redLabel); 
        southPanel.add (red);

        southPanel.add (greenLabel); 
        southPanel.add (green);

        southPanel.add (blueLabel); 
        southPanel.add (blue);

        add (colorValues, "North"); 
        add (southPanel, "South");

        r = 0; g = 0; b = 0; 
     } // method init

     // Inner class that is used to determine the values of the scroll bars. 
     class ScrollbarListener implements AdjustmentListener 
     { 
          Color color; 
          int colorValue, colorBar; 
  
          public ScrollbarListener (int colorBar) 
          { 
               this.colorBar = colorBar; 
          } // constructor

          public void adjustmentValueChanged (AdjustmentEvent event) 
          { 
               colorValue = event.getValue (); 
               switch (colorBar) 
               { 
                    case 0: r = colorValue; break; 
                    case 1: g = colorValue; break; 
                    case 2:  b = colorValue; break; 
               } // switch

               color = new Color (r, g, b); 
               canvas.setBackground (color); 
               colorValues.setText ("red = " + r + "green = "+ g +"blue = "+ b); 
          } 
     } // class ScrollbarListener 
} // class CheckColors 
 