/*
 *  odd number generating by 2 thread
 */
package lab3_semaphoreapplication;

/**
 *
 * @author cs13152 Shekhar PRasad Rajak
 */





public class Lab3_SemaphoreApplication {

    /**
     * @param args the command line arguments
     */
 
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



 public class oddMutex{
     private int n=1;
     Lab3_Semaphore mutex;
     public oddMutex(int initial){
         
         mutex =new Lab3_Semaphore(1);
         n=initial;
     
     }
     public int next(){
         mutex.down();
         ++n;
       try{
           Thread.sleep(100);
       }
       catch(InterruptedException e){}
       n++;
       mutex.up();
       return n;
         
     }
 
 
 }
 public class odd3 extends Thread{
     private oddMutex e;
     public odd3(oddMutex e){
         this.e=e;
     }
   public void run(){
       for(int i=1;i<10;i++){
           System.out.println(" Results : "+ e.next());
           
       }
   }
 
 
    
}
 public class main11{
          
    public main11(){
        int num =5;
        oddMutex e1=new oddMutex(num);
        odd3 t11=new odd3(e1);
        odd3 t22=new odd3(e1);
        t11.start();
        t22.start();
    }

}
 public static void main(String[] args) 
 {
        // TODO code application logic here
        main11 m =new main11();
    }
}
