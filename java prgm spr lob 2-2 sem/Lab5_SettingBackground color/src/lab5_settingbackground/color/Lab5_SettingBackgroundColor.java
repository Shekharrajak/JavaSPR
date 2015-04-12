/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_settingbackground.color;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author cs13152
 */
public class Lab5_SettingBackgroundColor extends Applet {

    /**
     * @param args the command line arguments
     */
   String msg;
// set the foreground and background colors.
public void init() {
setBackground(Color.cyan);
setForeground(Color.red);
msg = "Inside init( ) --";
}
// Initialize the string to be displayed.
public void start() {
msg += " Inside start( ) --";
}
// Display msg in applet window.
public void paint(Graphics g) {
msg += " Inside paint( ).";
g.drawString(msg, 10, 30);
}
}
/* A simple applet that sets the foreground and
background colors and outputs a string. */

/*
<applet code="Sample" width=300 height=50>
</applet>
*/

