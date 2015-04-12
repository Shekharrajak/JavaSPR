/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1b;
import java.util.*;
/**
 *
 * @author cs13152
 */
public class Lab2_1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name =new String("  hello  ");
        
       // System.out.println("Enter the name you want to modify : " );
        Scanner in =new Scanner(System.in);
        //name = in.next("  hello ");
        String name2=new String(" hi");
        System.out.println(name+name2);
        System.out.println(" After trimming : ");
        System.out.println(name.trim()+name2.trim());
        
    }
}
