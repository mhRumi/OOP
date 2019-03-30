
package Exceptions;


public class Throw {
    
    public Throw(int x)
    {
        if(x % 2 !=0)
            throw new ArithmeticException("Not Evem");
        else
            System.out.println("Even");
    }
    
}
