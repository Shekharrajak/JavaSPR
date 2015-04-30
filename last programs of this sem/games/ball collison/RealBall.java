import javax.swing.JFrame;

/**
 *
 * @author Anak1n
 */
public class RealBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui balls = new gui ();
        frame.setSize(400,400);
        frame.add(balls);
        frame.setVisible(true);
    }
    
}