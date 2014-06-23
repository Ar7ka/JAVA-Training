/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arkainitial;

import java.io.IOException;
import java.io.File;


public class File1 {
    public static void main(String[] args) throws IOException {
        
        /*FileWriter outputStream = null;
        Writer writer = null;
        String n="";*/

/*try {
    writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("monster.txt"), "utf-8"));
    writer.write("Something");
}  finally {
   if (outputStream != null) {
                outputStream.close();
}
    }*/
        try{
            String stamp = "filename";
            File permfile = new File("../" + stamp + ".txt");
            permfile.createNewFile();
            }
            catch(IOException k)
            { System.out.println("Oops");
            System.out.print(k);}
    }

    
    }

    
        
