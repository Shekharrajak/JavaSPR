/*
 * using two thread
 */
package lab3_producer_consumer;

/**
 *
 * @author cs13152 Shekhar Prasad Rajak 
 */
import java.util.*;
public class Lab3_Producer_Consumer {

    /**
     * @param args the command line arguments
     */
    
    
     public Lab3_Producer_Consumer(){
        // TODO code application logic here
        Vector sQueue =new Vector();
        int size=4;
        
    Thread tproducer =new Thread (new producer(sQueue,size) , "producer");
    Thread tconsumer =new Thread (new consumer(sQueue,size),"consumer");
    tproducer.start();
    tconsumer.start();
    
    }

    
    class producer implements Runnable{
        private final Vector sQueue;
        private final int size;
        
         //private void producer(int i);
      public producer(Vector sQueue,int size){
          this.sQueue=sQueue;
          this.size=size;
      
      }
      
      
     public void run(){
         for(int i=0;i<12;i++){
             System.out.println("Producer trying to insert item : "+ i);
         
         }
         try{
             produce(i);
         
         }
         catch(Exception ex){
              System.out.println(ex);
         }
         
     }
     
      private void produce(int i) throws InterruptedException{
        
          while(sQueue.size()==size){
            synchronized(sQueue){
            
        
        System.out.println(" Queue is full " +Thread.currentThread().getName()+" is waiting , size : " + sQueue.size() );
        sQueue.wait();
        
                }
        
        }
          synchronized(sQueue){
            sQueue.add(i);
            sQueue.notifyAll();
        
        }
          
  
    }
  }
  
 class consumer implements Runnable{
     private final Vector sQueue;
     private final int size;
     
     public consumer(Vector sQueue,int size){
         this.sQueue =sQueue;
         this.size=size;
     }
     public void run(){
         while(true){
             try{
                 System.out.println(" Consuming element : "+ consume());
                 Thread.sleep(10000);
             }
             catch(InterruptedException ex){
                 System.out.println(ex);
                         
             }
         }
     
     }
     
     private int consume() throws InterruptedException{
         while(sQueue.isEmpty()){
             synchronized(sQueue){
                 System.out.println(" Queue is empty "+Thread.currentThread().getName() + " is waiting for new element inserted by a producer.");
                 sQueue.wait();
             }
             
         
         }
       synchronized(sQueue){
           sQueue.notifyAll();
           return (Integer)sQueue.remove(0);
       }
         
     
     }
 }  
     public static void main(String[] args) {
        
       new Lab3_Producer_Consumer(); 
        
    } 
   
 }
    
    
    

  