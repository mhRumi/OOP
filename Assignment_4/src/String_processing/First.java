
package String_processing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class First {
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = null;
        String[] here = null;
        
        try {
            read = new BufferedReader(new FileReader("article.txt"));
           String line = read.readLine();
           while(line != null)
           {
               line = read.readLine();
               if(line != null){
               here = line.split("[?;! ]");
               }
           }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(First.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int unique = here.length;
        
        boolean[] chk = new boolean[unique];
        String[] unique_word = new String[unique];
        int[] frequency = new int[unique];
        
        System.out.println("Number of word is: "+here.length);
        
        for(int i=0; i<here.length; i++)
        {
            int test = 0;
            for(int j=i+1; j<here.length; j++)
            {
                if(here[i].equalsIgnoreCase(here[j])){
                    test++;
                    chk[j] = true;
                }
            }
            unique -= test;
            if(chk[i] == false){
                unique_word[i] = here[i];
                frequency[i] = test+1;
                
            }
        
        }
        
        System.out.println("Number of Unique word is: "+unique);
        
        for(int i=0; i<frequency.length; i++)
        {
            for(int j=i+1; j<frequency.length; j++)
            {
                if(frequency[j]>frequency[i])
                {
                    int temp;
                    temp = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = temp;
                    
                    String tmp;
                    tmp = unique_word[i];
                    unique_word[i] = unique_word[j];
                    unique_word[j] = tmp;
                }
            }
        }
        
        for(int i=0; i<chk.length; i++)
        {
            if(unique_word[i] != null)
            System.out.println(unique_word[i]+"    "+frequency[i]);
        }
    }
    
}
