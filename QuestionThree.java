//Prescribed by zubquzaini
import javax.swing.*;
import java.util.Scanner;

public class QuestionThree {
    
    public static void main() {
        
        System.out.println("\u000C");
        Scanner input = new Scanner(System.in);
        int totalPrice=0, numTickets=0;
        String seatLocation;
        
        // Console
        System.out.println("|Seat Location|    Description    | Price(RM)|");
        System.out.println("|      B      |      Box Seat     |   RM75   |"); 
        System.out.println("|      P      |   Pavillion Seat  |   RM30   |"); 
        System.out.println("|      L      |     Lawn Seat     |   RM21   |");
        
        System.out.println("\nEnter seat location: ");
        seatLocation = input.next();
        
        System.out.println("\nEnter number of tickets: ");
        numTickets = input.nextInt();
        
        if(seatLocation.compareTo("B") == 0) {
            totalPrice = numTickets * 75;
        } else if(seatLocation.compareTo("P") == 0) {
            totalPrice = numTickets * 30;
        } else if(seatLocation.compareTo("L") == 0) {
            totalPrice = numTickets * 21;
        }
        
        System.out.println("Total Price is RM" + totalPrice);
        
        // JOptionPane
        JOptionPane.showMessageDialog(null, "|Seat Location|    Description    | Price(RM)|\n|      B      |      Box Seat     |   RM75   |\n|      P      |   Pavillion Seat  |   RM30   |\n|      L      |     Lawn Seat     |   RM21   |");
        seatLocation = JOptionPane.showInputDialog("Enter seat location: ");
        numTickets = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tickets: "));
        
        if(seatLocation.compareTo("B") == 0) {
            totalPrice = numTickets * 75;
        } else if(seatLocation.compareTo("P") == 0) {
            totalPrice = numTickets * 30;
        } else if(seatLocation.compareTo("L") == 0) {
            totalPrice = numTickets * 21;
        }
        
        JOptionPane.showMessageDialog(null, "Total Price is RM" + totalPrice);
    }
}