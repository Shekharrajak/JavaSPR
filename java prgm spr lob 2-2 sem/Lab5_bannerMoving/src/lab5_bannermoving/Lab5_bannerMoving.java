/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_bannermoving;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author cs13152
 */
public class Lab5_bannerMoving extends Applet implements Runnable {

    /**
     * @param args the command line arguments
     */// A parameterized banner

/*
<applet code="ParamBanner" width=300 height=50>
<param name=message value="Java makes the Web move!">
</applet>
*/

String msg = " ~ Shekhar Prasad Rajak ~ ";
Thread t = null;
int state;
boolean stopFlag;
// Set colors and initialize thread.
public void init() {
setBackground(Color.black);
setForeground(Color.white);
}
// Start thread
public void start() {
//msg = getParameter("message");

if(msg == null) msg = "Message not found.";
msg = " " + msg;
t = new Thread(this);
stopFlag = false;
t.start();
}
// Entry point for the thread that runs the banner.
public void run() {

char ch;
// Display banner
for( ; ; ) {
try {
repaint();
Thread.sleep(100);
ch = msg.charAt(0);
msg = msg.substring(1, msg.length());
msg += ch;
if(stopFlag)
break;
} catch(InterruptedException e) {}
}
}
// Pause the banner.
public void stop() {
stopFlag = true;
t = null;
}
// Display the banner.
public void paint(Graphics g) {
g.drawString(msg, 100, 100);
}

}
