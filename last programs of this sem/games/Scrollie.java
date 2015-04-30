import java.applet.*;    
import java.awt.*;
import java.awt.event.*;

public class Scrollie extends Applet implements AdjustmentListener {

  private TextField t;
  private Scrollbar sb;

  public void init() {
    int initialValue = 1;
    sb = new  Scrollbar(Scrollbar.HORIZONTAL, initialValue, 100, 1, 100);
    sb.addAdjustmentListener(this);
    this.add(sb);
    this.t = new TextField(4);
    this.t.setText(String.valueOf(initialValue));    
    this.add(t);
  }
  
  public void adjustmentValueChanged(AdjustmentEvent e){
     
    int val = sb.getValue();
    this.t.setText(String.valueOf(val));
    
  }
  
}