/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package drawinghome;
import java.applet.*;
import java.awt.*;

/**
 *
 * @author cs13152
 */
public class DrawingHome extends Applet{

    /**
     * @param args the command line arguments
     */
    public void paint(Graphics gh){
        gh.drawLine(120, 40, 20, 100);
        gh.drawLine(120, 40, 220, 100);
        gh.drawRect(20, 100, 200, 180);
        int y[]={100,140,170,140,100,60,100};
        int y2[]={150,150,200,250,200,150};
        
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//        DrawingHome dh =new DrawingHome();
//        Graphics gh = null;
//        dh.paint(gh);
//    }
}
