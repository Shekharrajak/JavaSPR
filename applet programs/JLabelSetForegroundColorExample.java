/*
        Set Foreground Color of JLabel Example
        This java example shows how to set foreground color of JLabel using
        Java Swing JLabel class.
*/
 
 
import java.awt.Color;
 
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="JLabelSetForegroundColorExample" width=200 height=200>
</applet>
*/
 
public class JLabelSetForegroundColorExample extends JApplet{
 
        public void init(){
               
                /*
                 * To create JLabel use
                 * JLabel (String caption) constructor
                 * of JLabel class.
                 */
               
                JLabel label1 = new JLabel("JLabel Set Forground Color Example.");
                       
                /*
                 * To set foreground color of JLabel text use,
                 * void setForeground(Color color)
                 * method.
                 */
               
                //this will create light blue color
                Color customColor = new Color(10,10,255);
               
                label1.setForeground(customColor);
               
                //add label to applet
                add(label1);
        }
}