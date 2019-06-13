/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rumi
 */
public class Read {
    public static void main(String args[])
    {
        try {
            File file = new File("student.txt");
            Scanner input = new Scanner(file);
            
            while(input.hasNext())
            {
                String name = input.next();
                int id = input.nextInt();
                
                System.out.println(name+"   "+id);
            }
            
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Read.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
}
