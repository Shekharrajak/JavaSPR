/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mulmatrix;
import javax.swing.*;
/**
 *
 * @author cs13152
 */
public class MulMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // System.out.println( "");
        int r1 =Integer.parseInt(JOptionPane.showInputDialog(null," Enter the number of rows  in first matrix : "));
        int c1 =Integer.parseInt(JOptionPane.showInputDialog(null," Enter the number of coloumn in first matrix : "));
        
         JOptionPane.showMessageDialog( null ," Now enter the elements of first matrix : ");
         
         double [][] first = new double[r1][c1];
         for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++){
                 first[i][j] =Double.parseDouble(JOptionPane.showInputDialog(null," Enter the number present in row"+ i + "and col "+j ));
             }
         }
    
        int r2 =Integer.parseInt(JOptionPane.showInputDialog(null," Enter the number of rows  in second matrix : "));
        int c2 =Integer.parseInt(JOptionPane.showInputDialog(null," Enter the number of coloumn in second matrix : "));
        
         JOptionPane.showMessageDialog( null ," Now enter the elements of second matrix : ");
         
         double [][] second = new double[r2][c2];
         for(int i=0;i<r2;i++){
             for(int j=0;j<c2;j++){
                 second[i][j] =Double.parseDouble(JOptionPane.showInputDialog(null," Enter the number present in row"+ i + "and col "+j ));
             }
         }
    
         if(c1 != r2){
              JOptionPane.showMessageDialog( null ," Matrix multiplication is not possible !!! :p ");
         }
         double sum =0.0;
         double [][] multiply = new double[r1][c2];
         
         for(int i=0 ;i<r1 ;i++){
             for(int j=0;j<c2 ; j++){
                 for( int l=0;l<r2;l++){
                   sum = sum + first[i][l]*second[l][j];   
                 }
                 multiply[i][j]=sum;
                 sum=0;
             }
         }
         
         
         for(int i=0;i<r1;i++){
             for(int j=0;j<c2;j++){
                 System.out.print(multiply[i][j] + "  ");
                 //System.out.print()
             }
             System.out.println();
         }
    }
}
