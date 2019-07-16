
package First;


public class Demo {
    
    public static void main(String[] args) {
         Bank bank = new Bank();
        Customer1 customer1 = new Customer1(bank,1000);
        Customer1 customer2 = new Customer1(bank,500);
        Customer1 customer3 = new Customer1(bank,1500);
        Customer1 customer4 = new Customer1(bank,2000);
        
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
    
}
