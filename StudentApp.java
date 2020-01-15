// Prescribed by zubquzaini
import java.util.*;
import java.io.*;

public class StudentApp {

    public static void main(String args[]) {
        try {
            FileReader fr=new FileReader("record.txt");
            BufferedReader br=new BufferedReader(fr);
            
            FileWriter fw = new FileWriter("potentialStudent.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            int count = 0;
            String inline = br.readLine();
    
            while(inline != null) {
                count++;
                inline = br.readLine();
            }
            br.close();
            
            Student s[] = new Student[count];
            
            fr=new FileReader("record.txt");
            br=new BufferedReader(fr);
    
            StringTokenizer st = null;
            String data = "";
            String name = "";
            String group = "";
            double score1=0, score2=0, score3=0;


            for(int x=0; x<count; x++) {
                data = br.readLine();
                st = new StringTokenizer(data, "#");
                name = st.nextToken();
                group = st.nextToken();
                score1 = Double.parseDouble(st.nextToken());
                score2 = Double.parseDouble(st.nextToken());
                score3 = Double.parseDouble(st.nextToken());
                
                s[x] = new Student();
                s[x].setData(name, group, score1, score2, score3);
            }
            br.close();
            
            
            double max=0;
            int key=0;
            /*for(int y=0; y<count; y++) {
                double val = s[y].calAverage(); 
                if(max<val) {
                    max = s[y].calAverage();
                    key = y;
                }
            }*/
            
            System.out.println("Write your code competition's winner");
            System.out.println(s[key].toString());
            System.out.printf("Average score: %.2f \n", s[key].calAverage());
            
            int numPart3=0;
            for(int z=0; z<count; z++) {
                
                if(Integer.parseInt(s[z].getGroup().substring(5,6)) == 3) {
                    
                    numPart3++;
                }
            }
            
            System.out.println("Number of part 3 student: " + numPart3);
            
            for(int a=0; a<count; a++) {
                
                if(s[a].calAverage() > 90) {
                    
                    pw.println(s[a].toString());
                }
            }
            pw.close();
            
        } catch(EOFException eof) {
            
            System.out.println("Already at the end of file!");
        } catch(FileNotFoundException e) {
            
            System.out.println("File not exist :(");
        } catch(IOException ioe) {
            
            System.out.println("Problem: " + ioe.getMessage());
        } 
    }
}