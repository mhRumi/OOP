
package First;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank{
    
    private int Bank_balance = 100000;
    
    synchronized void withDraw(int amount){
        
        System.out.println("going to withdraw...");
        System.out.println("Current Bank's balance is "+Bank_balance);
        if(Bank_balance < amount){
            
             try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
         Bank_balance -= amount;
         
         System.out.println("withdraw completed...");
          System.out.println("Current Bank's balance is "+Bank_balance);
       
    }
    
}
