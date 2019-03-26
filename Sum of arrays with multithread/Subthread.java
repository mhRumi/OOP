package multithread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Subthread extends Thread{
    @Override
    public void run()
    {
        for(int i=0; i<10; i++){
            Arrays.F[i] = Arrays.C[i] + Arrays.D[i];
        }
    }
}
