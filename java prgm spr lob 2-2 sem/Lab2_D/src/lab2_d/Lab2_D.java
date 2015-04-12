/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_d;
import java.util.*;

/**
 *
 * @author cs13152
 */
public class Lab2_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String name =new String();
        
        System.out.println("Enter the String you want substring : " );
        Scanner in =new Scanner(System.in);
        name = in.nextLine();
       
        System.out.println(" Enter the begining of your string :");
        int a =in.nextInt();
        
        System.out.println(" Enter the ending of your substring :");
        int b=in.nextInt();
        System.out.println(name.subSequence(a,b));
    }
}
