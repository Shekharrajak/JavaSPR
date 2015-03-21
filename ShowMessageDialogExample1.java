import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class ShowMessageDialogExample1
{
  public static void main(String[] args)
  {
    // create our jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
 
    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog( frame,
        "Your RSS feed has been published", 
        "RSS Feed Published", 
        JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon(ShowMessageDialogExample1.class.getResource("spr.png")));
 
    System.exit(0);
  }
}