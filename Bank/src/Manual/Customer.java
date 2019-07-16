
package Manual;

public class Customer extends Thread {
    
    Bank bank;
    int amount;
    public Customer(int amount, Bank bank){
        this.amount = amount;
        this.bank = bank;
    }
    
    @Override
    public void run(){
        bank.withDraw(amount);
    }
}
