/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

public class Demo {
    
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer(1000,bank);
        Customer customer2 = new Customer(1500,bank);
        Customer customer3 = new Customer(500,bank);
        Customer customer4 = new Customer(2000,bank);
        
        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
    }
    
}
