import objectdraw.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollDemo extends WindowController 
                                implements AdjustmentListener
{
   private Scrollbar redScrollBar, greenScrollBar, blueScrollBar;
   private FilledRect rect;
   private Text r, g, b;

   public void begin()
   {
      Panel colorPanel = new Panel();

      rect = new FilledRect(10, 20, 300, 100, canvas);
      new FramedRect(9, 19, 302, 102, canvas);

      new Text("Move the RGB scrollbars to adjust the color", 10, 150, canvas);

      makeRGBlabels();

      redScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
      redScrollBar.addAdjustmentListener( this );
      colorPanel.add(redScrollBar);

      greenScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
      greenScrollBar.addAdjustmentListener( this );
      colorPanel.add(greenScrollBar);

      blueScrollBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 256);
      blueScrollBar.addAdjustmentListener( this );
      colorPanel.add(blueScrollBar);

      add (colorPanel, BorderLayout.SOUTH);
   }   

   public void adjustmentValueChanged(AdjustmentEvent event)
   {
      int red   = redScrollBar.getValue(), 
          green = greenScrollBar.getValue(),
          blue  = blueScrollBar.getValue();

      rect.setColor( new Color( red, green, blue ) );

      r.setText(red);
      g.setText(green);
      b.setText(blue);
   }

   private void makeRGBlabels()
   {
      r = new Text("0", 194, 250, canvas);  
      g = new Text("0", 248, 250, canvas);
      b = new Text("0", 303, 250, canvas);

      r.setColor( new Color(255, 0, 0) );
      g.setColor( new Color(0, 255, 0) );
      b.setColor( new Color(0, 0, 255) );

      r.setBold();  
      g.setBold();
      b.setBold();

      r.setFontSize(16);
      g.setFontSize(16);
      b.setFontSize(16);
   }
}