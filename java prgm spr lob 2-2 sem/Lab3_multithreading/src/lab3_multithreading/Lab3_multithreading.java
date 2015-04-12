/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_multithreading;
import java.util.*;
import java.math.*;
import java.lang.InterruptedException;
import java.lang.Math;
/**
 *
 * @author cs13152 shekhar Prasad Rajak
 */
public class Lab3_multithreading {

    /**
     * @param args the command line arguments
     */
       private class simpleThread extends Thread {
        public simpleThread(String str)
        {
            super(str);
            
        }
        public void run(){
            for (int i=0;i<10;i++){
                System.out.println(getName()+" says "+i);
                try{
                    //timeUnit.SECONDS.sleep(10);
                    //Thread.sleep((long))
                    Thread.sleep.((long)math.random()+1000);
                    }
                catch(Exception e){}
               
             }
        
        System.out.println(getName()+" is done !!");
            
        }
    
    }  
     
    
    
    public  Lab3_multithreading(){
        
        (new simpleThread("First thread ")).start();
        (new simpleThread("Second thread ")).start();
        (new simpleThread("Third thread ")).start();
        (new simpleThread("Fourth thread ")).start();
        (new simpleThread("Fifth thread ")).start();
        (new simpleThread("Sixth thread ")).start();
    
    
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Lab3_multithreading();
    }
}
