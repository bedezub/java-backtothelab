// Prescribed by zubquzaini
import java.util.*;

public class CustOrderApp {
    
    public static void main() {
        
        CustOrder c[] = new CustOrder[3];
        Scanner sc = new Scanner(System.in);
        String name, contact;
        int day, month, year, guest;
        char pack;
        
        for(int x=0; x<3; x++) {
            sc.nextLine();
            System.out.println("Enter all information of customer order " + (x+1) + ": ");
            System.out.print("Enter customer name: ");
            name = sc.nextLine();
            
            System.out.print("Enter contact number: ");
            contact = sc.next();
            
            System.out.print("Enter wedding date \n");

            System.out.print("Enter day [example: 01 to 31]: ");
            day = sc.nextInt();
            System.out.print("Enter month [example: 01 to 31]: ");
            month = sc.nextInt();
            System.out.print("Enter year [example: 01 to 31]: ");
            year = sc.nextInt();
            
            System.out.print("Number of guest: ");
            guest = sc.nextInt();
            System.out.print("Enter package [A/B/C]: ");
            pack = sc.next().charAt(0);
            
            c[x] = new CustOrder(name, contact, day, month, year, guest, pack);
        }
        
        for(int x=0; x<3; x++) {
            System.out.println("All information of customer " + (x+1) + ": ");
            System.out.println("*****************************************");
            
            System.out.println(c[x].toString());
        }
    }

}