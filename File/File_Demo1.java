package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class File_Demo1 {

    public static void main(String[] args) throws MalformedURLException, IOException {
     
//                    File f = new File("/run/media/rumi/new folder/Bangladesh");
//        f.mkdir();
//      
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.getName());
//        if(f.delete())
//            System.out.println("Folder has been deleted");
//        
//        File f1 = new File("/run/media/rumi/new folder/Bangladesh/student.txt");
//        File f2 = new File("/run/media/rumi/new folder/Bangladesh/teacher.txt");
//        try {
//            f1.createNewFile();
//            f2.createNewFile();
//        } catch (IOException ex) {
//            Logger.getLogger(File_Demo1.class.getName()).log(Level.SEVERE, null, ex);
//       }

//
//            Scanner input = new Scanner(System.in);
//            String name;
//            int reg;
//            System.out.print("Enter student name: ");
//            name = input.next();
//            System.out.print("Enter registation number: ");
//            reg = input.nextInt();
//            try {
//                FileWriter fx = new FileWriter("article.txt");
//                fx.write(name+"   "+reg);
//                fx.close();
//
//            } catch (IOException ex) {
//                System.out.println(ex);
//            }
//            
                // Read from url

//                  URL url = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
//                  
//                  InputStream stream = url.openStream();
//                  
//                  BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//                  String line = reader.readLine();
//                  
//                  while(line != null)
//                  {
//                      System.out.println(line);
//                      line = reader.readLine();
//                  }





                 FileInputStream in = null;
                 FileOutputStream out = null;
                 
                 in = new FileInputStream("output.txt");
                 out = new FileOutputStream("article.txt");
                 
                 int c;
                 while((c = in.read()) != -1)
                 {
                     out.write(c);
                 }
                 
                 if(in != null)
                     in.close();
                 if(out != null)
                     out.close();
    }
}