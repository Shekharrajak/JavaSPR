/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namesorting;
import java.util.*;
import java.io.*;
/**
 *
 * @author cs13152
 */
public class NameSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the number of names you want to enter : ");
        
        int n = in.nextInt();
        
        System.out.println(" Enter the names : ");
        
                
        String [] names=new String[n];
        //char ch[][] =new char[20][20];
        System.out.println();
        
        for(int i =0 ;i< n ;i++){
            System.out.println(" Enter the "+ i+ " name : ");
            System.out.println();
                    
            names[i]=in.next();
        }
        
        
        System.out.println( " The Sorted Names are : ");
        
       // String []sorted = new String[n];
        String temp =new String();
        //int l=0;
        for(int i=0;i<n;i++){
        for(int j =i+1;j<n;j++){
            int c =names[i].compareTo(names[j]);
           // names[j].replaceAll(temp, temp)
           
            
            if(c>0){
                temp =names[j];
                 //names[j].replaceAll(temp ,names[j]);
               
                names[j]=names[i]; 
                //names[j].replaceAll(names[j], names[i]);
                
                names[i]=temp; 
                // names[i].replaceAll(names[i],temp);
            }
        }
    }
        
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        }
}
}

