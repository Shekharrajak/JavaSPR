/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2c;
import java.util.*;

/**
 *
 * @author cs13152
 */
public class Lab_2C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name =new String();
        
        System.out.println("Enter the name you want to modify : " );
        Scanner in =new Scanner(System.in);
        name = in.nextLine();
       
        System.out.println(name.indexOf(" "));
        
    }
}
