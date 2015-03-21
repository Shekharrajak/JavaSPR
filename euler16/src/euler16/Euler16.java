/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euler16;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Shekhar Prasad Rajak
 */
public class Euler16 {

    

        public static void main(string[] args) {
            new Euler16().SolveUsingBigInteger();            
        }

        public void SolveUsingBigInteger() {
            //Stopwatch clock = Stopwatch.StartNew();

        int value = 2;
        int exponent = 1000;
            int result = 0;

            BigInteger number = BigInteger.Pow(value, exponent);

            while (number > 0) {
                result += (int) (number % 10);
                number /= 10;
            }
        
           // clock.Stop();            
           System.out.println
("The sum og digits of {1}^{2} is: {0}", result, value, exponent);
            //Console.WriteLine("Solution took {0} ms", clock.ElapsedMilliseconds);
        }

    }
}
}
