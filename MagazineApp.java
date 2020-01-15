// Prescribed by zubquzaini
import java.util.*;

public class MagazineApp {

    public static void main(String args[]) {
        
        String displayAbove30 = "";
        String displayGamblo = "";
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of the magazine: ");
        int num = in.nextInt();
        
        for(int x=0; x<num; x++){
            in.nextLine();
            
            System.out.print("\nEnter title of the magazine: ");
            String title = in.nextLine();
            
            System.out.print("Enter number of pages: ");
            int numPages = in.nextInt();
            
            System.out.println("Enter type of hard cover: Gamblo or Wood");
            String material = in.next();
            
            Magazine m = new Magazine(title, numPages, material);
            m.setMagazine(title, numPages, material);
            
            if(material.equalsIgnoreCase("Gamblo")) {
                displayGamblo = displayGamblo + "\n" + m.toString() + "\nCost: RM" + m.calcCost();
            } 
            
            if(m.calcCost() > 30) {
                displayAbove30 = displayAbove30 + "\n" + m.toString() + "\nCost: RM" + m.calcCost();
            }
        }   
        
        
        System.out.print("\nMagazine with Gamblo cover" + displayGamblo + "\n");
        System.out.print("\nMagazine with price above RM30" + displayAbove30 + "\n");
    }
}