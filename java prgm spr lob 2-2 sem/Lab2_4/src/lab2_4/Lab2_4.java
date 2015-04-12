/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_4;
import java.util.*;
/**
 *
 * @author cs13152
 */
public class Lab2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1,s2;
        Scanner in =new Scanner(System.in);
        long start1 =System.currentTimeMillis();
        s1=in.next();
        long end1 =System.currentTimeMillis();
        
        System.out.println("The first string time taken is : " + (end1-start1));
        //Scanner in =new Scanner(System.in);
        long start2 =System.currentTimeMillis();
        s2=in.next();
        long end2 =System.currentTimeMillis();
        System.out.println("The first string time taken is : " + (end1-start1));
        
        if((end1-start1)> (end2-start2)){
            System.out.println("First entered string performance is better !!! :) ");
                    
        }
        else {
            System.out.println("Seconde entered string performance is better !!! :) ");
                    
        }
    }
}
