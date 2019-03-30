
package Exceptions;

import java.util.Scanner;

public class MainCls {
    
    public static void main(String[] args) throws ArithmeticException{

        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();

        Throw th = new Throw(a);

        b = input.nextInt();
        c = input.nextInt();

        Throws th1 = new Throws();

         try {
            System.out.println(th1.division(b, c));
        }catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

    }
    
}
