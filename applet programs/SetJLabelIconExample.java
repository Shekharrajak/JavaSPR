/*
        Set Icon for JLabel Example
        This java example shows how to set image icon for JLabel using
        setIcon method of Java Swing JLabel class.
*/
 
 
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JLabel;
 
/*
<applet code="SetJLabelIconExample" width=200 height=200>
</applet>
*/
public class SetJLabelIconExample extends JApplet{
       
        public void init(){
               
                /*
                 * To create JLabel use
                 * JLabel (String caption) constructor
                 * of JLabel class.
                 */
               
                JLabel label1 = new JLabel("JLabel Set Icon Example.");
                //Color newcolor =new Color(20,255,20);      
                //add label to applet
                //label1.setForground(newcolor);
                add(label1);
 
                /*
                 * To set image icon for JLabel use,
                 * void setLabel(Icon icon)
                 * method of JLabel class.
                 */
               
                label1.setIcon(new ImageIcon("copy.jpg"));
        }
}