/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;
import java.util.*;
/**
 *
 * @author cs13152
 */
public class Lab2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String number =new String();
        
        System.out.println("Enter the number ( put space between every digit ) : " );
        Scanner in =new Scanner(System.in);
        number = in.nextLine();
        
       StringTokenizer st = new StringTokenizer(number);
       //char[] numberStr = new char(st.);
       int size = st.countTokens();
       char[] c =new char[size];
       int sum=0;
       for(int i=0;i<size;i++){
           int a =Integer.parseInt(st.nextToken());
           System.out.println(a);
           sum+=a;
           
       }
     System.out.println(sum);
    }
}
