/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1.a;
import java.util.*;
import java.io.*;

/**
 *
 * @author cs13152
 */
public class Lab2_1A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name =new String();
        
        System.out.println("Enter the name you want to modify : " );
        Scanner in =new Scanner(System.in);
        name = in.next();
       
        System.out.println("Enter the character you want toreplace : ");
        String c;
        c=in.next();
        char[] c1=c.toCharArray();
        
        System.out.print("Enter the replacing character :");
        String t;
        t=in.next();
        char [] c2 =t.toCharArray();
        
       
        
        System.out.println( name.replace(c,t));
    }
}
