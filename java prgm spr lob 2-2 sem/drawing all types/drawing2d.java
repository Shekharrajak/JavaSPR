/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package graphics;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 *
 */
public class drawing2d extends JFrame {

    public drawing2d() {
        super("Graphics 2D Shapes By Achchuthan @ java90.blogspot.com");
        setBackground(Color.black);
        setSize(600, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        //-------------Line------------------------------------
        g2d.setPaint(Color.red);
        g2d.setStroke(new BasicStroke(6.0f));
        g2d.draw(new Line2D.Double(100, 150, 500, 150));
        //--------------Rectangle-----------------------------
        g2d.setPaint(Color.green);
        g2d.setStroke(new BasicStroke(7.0f));
        g2d.draw(new Rectangle2D.Double(100, 200, 65, 100));
        //--------------RoundRectangle----------------------
        g2d.setPaint(Color.black);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.draw(new RoundRectangle2D.Double(100, 40, 75, 100, 50, 50));
        //-------------Squre-----------------------------------
        g2d.setPaint(Color.gray);
        g2d.setStroke(new BasicStroke(9.0f));
        g2d.draw(new Rectangle.Double(200, 200, 50, 50));
        //-----------Ellipse--------------------------------------
        g2d.setPaint(Color.yellow);
        g2d.setStroke(new BasicStroke(3.0f));
        g2d.draw(new Ellipse2D.Double(200, 40, 165, 100));
        //--------------Circle------------------------------------
        g2d.setPaint(Color.blue);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.fill(new Ellipse2D.Double(400, 40, 100, 100));
        //-----------------Arcpie--------------------------------
        g2d.setPaint(Color.orange);
        g2d.setStroke(new BasicStroke(4.0f));
        g2d.draw(new Arc2D.Double(280, 200, 75, 100, 0, -270, Arc2D.PIE));
        //--------------------Arc Chord--------------------------
        g2d.setPaint(Color.orange);
        g2d.setStroke(new BasicStroke(4.0f));
        g2d.draw(new Arc2D.Double(280, 200, 75, 100, 0, -270, Arc2D.CHORD));
        //--------------------Arc Open--------------------------
        g2d.setPaint(Color.orange);
        g2d.setStroke(new BasicStroke(4.0f));
        g2d.draw(new Arc2D.Double(280, 200, 75, 100, 0, -270, Arc2D.OPEN));
        //---------------------Gradeint-----------------------------
        Color c1 = new Color(255, 175, 175);
        Color c2 = new Color(255, 0, 0);
        g2d.setPaint(new GradientPaint(5, 30, c1, 35, 100, c2, true));
        g2d.setStroke(new BasicStroke(4.0f));
        g2d.fill(new Ellipse2D.Double(100, 340, 150, 100));
        //----------------------Dashes--------------------------------
        float dashes[] = {10};
        g2d.setPaint(Color.red);
        
        g2d.setStroke(new BasicStroke(6, BasicStroke.CAP_ROUND,
                                  BasicStroke.JOIN_ROUND, 10, dashes, 0));
        g2d.draw(new Line2D.Double(100, 320, 500, 320));
        g2d.setPaint(Color.red);
        g2d.draw(new RoundRectangle2D.Double(300, 340, 200, 100, 50, 50));

    }

    public static void main(String args[]) {
        drawing2d d = new drawing2d();
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}