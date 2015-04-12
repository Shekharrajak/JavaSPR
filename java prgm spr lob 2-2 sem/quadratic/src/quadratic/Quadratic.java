/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic;
import javax.swing.*;
//import java.util.*;
//import java.lang.*;

/**
 *
 * @author cs13152
 */
public class Quadratic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      
      double a =Double.parseDouble(JOptionPane.showInputDialog(null," Enter a : "));
      double b= Double.parseDouble(JOptionPane.showInputDialog(null," Enter b : "));
      double c=Double.parseDouble(JOptionPane.showInputDialog(null," Enter c  : "));
      
      
      double d = (b*b - 4*a*c);
      
      if(d<0){
           JOptionPane.showMessageDialog( null ," discriminant is less than zero no real solution ");//,JOptionPane.ERROR_MESSAGE
          System.out.println( " discriminant is less than zero no real solution . ");
      }
      else{
          double r1 = (-b + Math.sqrt(d))/(2*a) ;
          double r2 = (-b - Math.sqrt(d))/(2*a);
          
          JOptionPane.showMessageDialog( null ," First Root is :" + r1 + " Second root is : " + r2 );
          System.out.println(" First root is :" + r1);
          System.out.println(" second root is :" + r2);
          
      }
    }
}
