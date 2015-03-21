

import java.util.*;

public class StringTokenizerDemo {
   public static void main(String[] args) {
      // creating string tokenizer
      StringTokenizer st = new StringTokenizer("Tutorialspoint is & the best site for learning");
      
      // counting tokens
      System.out.println("Total tokens : " + st.countTokens());       
   }
}