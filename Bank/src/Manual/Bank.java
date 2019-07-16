
package Manual;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank {
    
     private int Bank_balance = 100000;
     private boolean check = false;
    
    public void withDraw(int amount){
        
        if(check){
            try {
                System.out.println("Wait the system is busy now");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Bank.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
        else{
            check = true;
             System.out.println("going to withdraw...");
        System.out.println("Current Bank's balance is "+Bank_balance);
        if(Bank_balance < amount){
               System.out.println("Current Bank's balance too low");
        }
         Bank_balance -= amount;
         
         System.out.println("withdraw completed...");
          System.out.println("Current Bank's balance is "+Bank_balance);
          
          
        }
        notify();
        
        check = false;
        
       
        
    }
    
}
