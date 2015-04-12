/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3a;
import java.util.*;
/**
 *
 * @author cs13152
 */
public class Lab2_3A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         String name =new String();
        
        System.out.println("Enter the String you want substring : " );
        Scanner in =new Scanner(System.in);
        name = in.nextLine();
       
        System.out.println("Enter the string u want to match :");
        String name1 = in.nextLine();
        
        System.out.println(name.regionMatches( 0,name1 , 0, name1.length()));
        
    }
}
