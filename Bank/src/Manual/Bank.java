
package Manual;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
    
     private int Bank_balance = 100000;
     private boolean check = false;
    
    public void withDraw(int amount){
        
        while(check){
            
                System.out.println(Thread.currentThread().getName()+"   Wait the system is busy now");       
    }
        check = true;
           
        System.out.println(Thread.currentThread().getName()+"  going to withdraw...");
        System.out.println("Current Bank's balance is "+Bank_balance);
        if(Bank_balance < amount){
               System.out.println("Current Bank's balance too low");
        }
         Bank_balance -= amount;
         
         System.out.println("withdraw completed...");
          System.out.println(Thread.currentThread().getName()+"   Current Bank's balance is after withdraw "+Bank_balance);
          
         check = false;     
    }
    
}
