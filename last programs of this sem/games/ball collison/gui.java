
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Anak1n
 */
public class gui extends JPanel implements Runnable {

    ball b1;
    boolean going = true;

    Thread animator;
    ball b2;
    double deltaX;
    double deltaY;
    double distance;

    public gui() {
        b1 = new ball(50, 80, 40, Color.red);
        b1.setX(50);
        b1.setY(80);
        b1.setxSpeed(4);
        b1.setySpeed(2);

        b2 = new ball(50, 80, 70, Color.red);
        b2.setX(150);
        b2.setY(80);
        b2.setxSpeed(4);
        b2.setySpeed(2);

        

        animator = new Thread(this);
        animator.start();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        b1.draw(g);
        b2.draw(g);
        g.setColor(Color.red);

        // draw center of circle
        
        
        g.fillOval((int) b1.getX() - 5, (int) b1.getY() - 5, 10, 10);
        g.fillOval((int) b2.getX() - 5, (int) b2.getY() - 5, 10, 10);

    }

    @Override
    public void run() {
        while (going) {
            b1.move();
            b2.move();

            checkCollision();

            repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void checkCollision() {

        deltaX = Math.abs(b1.getX() - b2.getX());
        deltaY = Math.abs(b1.getY() - b2.getY());
        distance = deltaX * deltaX + deltaY * deltaY;
        
        if (distance < (b1.getDiametar() / 2 + b2.getDiametar() / 2) * (b1.getDiametar() / 2 + b2.getDiametar() / 2)) {

            double newxSpeed1 = (b1.getxSpeed() * (4 - 5) + (2 * 5 * b2.getxSpeed())) / 11;

            double newxSpeed2 = (b2.getxSpeed() * (5 - 4) + (2 * 4 * b1.getxSpeed())) / 11;

            double newySpeed1 = (b1.getySpeed() * (4 - 5) + (2 * 5 * b2.getySpeed())) / 11;

            double newySpeed2 = (b2.getySpeed() * (5+ - 4) + (2 * 4 * b1.getySpeed())) / 11;
            
            //--------------
//            
//            double newxSpeed1 = (b1.getxSpeed() * (4 - 7) + (2 * 7 * b2.getxSpeed())) / 11;
//
//            double newxSpeed2 = (b2.getxSpeed() * (7 - 4) + (2 * 4 * b1.getxSpeed())) / 11;
//
//            double newySpeed1 = (b1.getySpeed() * (4 - 7) + (2 * 7 * b2.getySpeed())) / 11;
//
//            double newySpeed2 = (b2.getySpeed() * (7 - 4) + (2 * 4 * b1.getySpeed())) / 11;

            
            
            //
            b2.setxSpeed(newxSpeed2);
            b2.setySpeed(newySpeed2);
            b1.setxSpeed(newxSpeed1);
            b1.setySpeed(newySpeed1);

        }
    }

}