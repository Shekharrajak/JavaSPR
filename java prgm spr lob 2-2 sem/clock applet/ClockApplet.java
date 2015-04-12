import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author ACHCHUTHAN
 */
public class ClockApplet extends Applet implements Runnable {

    Thread timerThread;

    /**
     * Called by the browser or applet viewer to inform this applet that it
     * should start its execution. It is called after the
     * init method and each time the applet is revisited in a Web
     * page. A subclass of
     * Applet should override this method if it has any operation
     * that it wants to perform each time the Web page containing it is visited.
     * For example, an applet with animation might want to use the
     * start method to resume animation, and the
     * stop method to suspend the animation. 
Note: some
     * methods, such as
     * getLocationOnScreen, can only provide meaningful results if
     * the applet is showing. Because
     * isShowing returns
     * false when the applet's
     * start is first called, methods requiring
     * isShowing to return
     * true should be called from a
     * ComponentListener. 
The implementation of this method
     * provided by the
     * Applet class does nothing.
     *
     * @see java.applet.Applet#destroy()
     * @see java.applet.Applet#init()
     * @see java.applet.Applet#stop()
     * @see java.awt.Component#isShowing()
     * @see
     * java.awt.event.ComponentListener#componentShown(java.awt.event.ComponentEvent)
     */
    public void start() {
        timerThread = new Thread(this, "clock");
        timerThread.start();
    }

    /**
     * Called by the browser or applet viewer to inform this applet that it
     * should stop its execution. It is called when the Web page that contains
     * this applet has been replaced by another page, and also just before the
     * applet is to be destroyed. 
A subclass of
     * Applet should override this method if it has any operation
     * that it wants to perform each time the Web page containing it is no
     * longer visible. For example, an applet with animation might want to use
     * the
     * start method to resume animation, and the
     * stop method to suspend the animation. 
The implementation
     * of this method provided by the
     * Applet class does nothing.
     *
     * @see java.applet.Applet#destroy()
     * @see java.applet.Applet#init()
     */
    public void stop() {
        if (timerThread == null) {
            return;
        }
        timerThread.stop();
        timerThread = null;
    }

    /**
     * When an object implementing interface
     * Runnable is used to create a thread, starting the thread
     * causes the object's
     * run method to be called in that separately executing thread.
     * 
The general contract of the method
     * run is that it may take any action whatsoever.
     *
     * @see java.lang.Thread#run()
     */
    public void run() {
        while (timerThread != null) {
            repaint();
            try {
                timerThread.sleep(100);
            } catch (InterruptedException e) {
                /**
                 * do nothing
                 */

            }
        }
    }

    /**
     * Paints the container. This forwards the paint to any lightweight
     * components that are children of this container. If this method is
     * reimplemented, super.paint(g) should be called so that lightweight
     * components are properly rendered. If a child component is entirely
     * clipped by the current clipping setting in g, paint() will not be
     * forwarded to that child.
     *
     * @param g the specified Graphics window
     * @see Component#update(Graphics)
     */
    public void paint(Graphics g) {
        Date d = new Date();
        Font f1 = new Font("Arial", Font.ITALIC, 40);
        Font f2 = new Font("Arial", Font.BOLD, 40);
        Random r = new Random();
        int x = (r.nextInt() % 10) + 60;
        g.setFont(f1);
        g.drawString("\t\t\t Digital clock\n", 50, x);
        g.setFont(f2);
        g.setColor(Color.red);
        g.drawString(d.getHours() + ":" + d.getMinutes()
                + ":" + d.getSeconds(), 50, 150);
    }
}