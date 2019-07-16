
package First;

public class Customer1 extends Thread{
    Bank bank;
    int amount;
    
    public Customer1(Bank bank, int amount){
        this.bank = bank;
        this.amount = amount;
    }
    
    public void run(){
        bank.withDraw(amount);
    }
}
