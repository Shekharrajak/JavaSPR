/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_4mousehandler;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 *
 * @author cs13152
 */
public class Lab_4MouseHandler extends Applet implements MouseListener, MouseMotionListener{

    String msg="";
    int mouseX=0,mouseY=0;
    
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me){
        mouseX=0;
        mouseY=0;
        msg ="Mouse Clicked!";
        repaint();
        
    }
    public void mouseEntered(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg="Mouse entered!";
        repaint();
    }
    public void mouseExited(MouseEvent me){
        mouseX=0;
        mouseY=10;
        msg= "Mouse Exited !";
        repaint();
    }
    
    public void mousePressed(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Down";
        repaint();
        
    }
    public void mouseReleased(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="Up";
        repaint();
        
    }
    public void mouseDragged(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="*";
        showStatus("Dragging mouse at "+mouseX+" , "+"mouseY");
        repaint();
        
    }
    public void mouseMoved(MouseEvent me){
        showStatus("Moving mouse at "+ me.getX()+" , "+me.getY());
        
    }
    public void paint(Graphics g){
        g.drawString(msg, mouseX,mouseY);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graphics g;
        
    
    }
}
