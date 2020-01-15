// Prescribed by zubquzaini

import java.util.*;
import java.io.*;

public class Score1 {
    
    public static void main(String [] args) throws Exception {
        
        try {
            FileReader fr = new FileReader("score.txt");
            BufferedReader br = new BufferedReader(fr);
            
            FileWriter fw = new FileWriter("scoreout.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            String inline = null; 
            int total = 0;
            
            pw.println("    Total Score for each student    \n");
            
            while((inline = br.readLine()) != null) {
                
                StringTokenizer st = new StringTokenizer(inline);
                
                String name = st.nextToken();
                int numOne = Integer.parseInt(st.nextToken());
                int numTwo= Integer.parseInt(st.nextToken());
                
                total = numOne + numTwo;
                //System.out.println("Debug" + inline);
                pw.println(name + " " + total + "\n");
            } 
            
            System.out.print("Success!");
            pw.close();
            br.close();
        } catch (FileNotFoundException fnf) {
            
            System.out.println("File not found :(");
        } catch (EOFException eof) {
            
            System.out.println("File end here :(");
        } catch (IOException io) {
            
            System.out.println("File input/output does not match :(");
        }

    }

}