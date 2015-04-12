/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_semaphore;

/**
 *
 * @author cs13152 Shekahr Prasad Rajak
 */
import java.lang.Math;

public class Lab3_Semaphore {

    private int value;
    public Lab3_Semaphore(int init){
        if(init <0){
            init=0;
            value =init;
            
        }
        value =init;
    
    }
   public synchronized void down(){
       while(value ==0){
           try{
               wait();
           }
           catch(InterruptedException e){
           
           }
       }
       value--;
   
   }
  public synchronized void up(){
      value++;
      notify();
  }
    public static void main(String[] args) {
        // TODO code application logic here
        int noThreadInCriticalSection=3;
        Lab3_Semaphore mutex =new Lab3_Semaphore(noThreadInCriticalSection);
        
        for(int i=1;i<10;i++){
        
            new MutexThread(mutex,"Thread "+i);
        }
    }
}
class MutexThread extends Thread{
    private Lab3_Semaphore mutex;
    public MutexThread(Lab3_Semaphore mutex,String name){
        super(name);
        this.mutex=mutex;
        start();
    }
    public void run(){
        while(true){
            mutex.down();
            System.out.println(" Enter Critical section : "+getName());
            
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){}
            System.out.println(" Leave critical Section : "+getName());
            mutex.up();
        }
    
    }


}
