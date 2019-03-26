
package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadingCls1 {
    public static void main(String args[])
    {
        Arrays a = new Arrays();
        
        Subthread t = new Subthread();
        t.start();
        
        for(int i=0; i<10; i++)
        {
            a.E[i] = a.A[i]+a.B[i];
        }
        try {
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadingCls1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0; i<10; i++)
        {
            a.G[i]=a.E[i]+a.F[i];
        }
        
        for(int i=0; i<10; i++)
        {
            System.out.println(a.G[i]);
        }
    }
    
}
