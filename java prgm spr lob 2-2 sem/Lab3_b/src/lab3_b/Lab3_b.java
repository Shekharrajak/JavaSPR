/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_b;
import java.util.*;
/**
 *
 * @author cs13152
 */
public class Lab3_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
         String name =new String();
        
        System.out.println("Enter the String you want substring : " );
        Scanner in =new Scanner(System.in);
        name = in.next();
       
        boolean flag =true;
        while(flag){
        System.out.println("Enter the begining index of substring  :");
        int beg = Integer.parseInt(in.next());
        
        System.out.println("Enter the ending index of substring  :");
        int end = Integer.parseInt(in.next());
        
        System.out.append(name.substring(beg, end));
        
        System.out.println("Do you want to get more substring :(true/false)");
        flag =(in.nextBoolean());
        
        
        }
    }
}
