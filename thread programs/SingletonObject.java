public class SingletonObject  
{  
    private static SingletonObject INSTANCE;  
  
    private SingletonObject()  
    {  
    }  
  
    public static SingletonObject getInstance()  
    {  
      if (INSTANCE == null)  
          INSTANCE = new SingletonObject();  
      return INSTANCE;  
    }  
}  