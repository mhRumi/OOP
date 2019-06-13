/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rumi
 */
public class Write {
    public static void main(String args[]) throws IOException
    {
       FileWriter f = new FileWriter("student.txt");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       
       for(int i=0; i<n; i++)
       {
           String name = input.next();
           int id = input.nextInt();
           
           f.write( name+"   "+id+"\n");
       }
       f.close();
    }
    
}
