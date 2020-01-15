// Prescribed by zubquzaini

import javax.swing.*;
import java.util.Scanner;

public class QuestionOne {

    public static void main() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("\u000C");
        
        int val=0;
        
        // Console
        while(val==0) {
            
            System.out.println("Enter flight number: ");
            String flightCode = input.nextLine();
        
            if(flightCode.substring(0,2).compareTo("AK") == 0) {
                System.out.println("Flight Operator: AirAsia Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("FY") == 0) {
                System.out.println("Flight Operator: FireFly Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("GD") == 0) {
                System.out.println("Flight Operator: Garuda Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("MH") == 0) {
                System.out.println("Flight Operator: Malaysia Airlines");
                val=1;            
            } else if(flightCode.substring(0,2).compareTo("MN") == 0) {
                System.out.println("Flight Operator: Manila Airlines");
                val=1;           
            } else if(flightCode.substring(0,2).compareTo("PL") == 0) {
                System.out.println("Flight Operator: Pelangi Airlines");
                val=1;            
            } else {
                System.out.println("Flight operator not found.\nPlease enter the right code\n");
            }
        }
        
        val=0;
        
        while(val==0) {
            
            String flightCode = JOptionPane.showInputDialog("Enter flight number: ");
        
            if(flightCode.substring(0,2).compareTo("AK") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: AirAsia Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("FY") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: FireFly Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("GD") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: Garuda Airlines");
                val=1;
            } else if(flightCode.substring(0,2).compareTo("MH") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: Malaysia Airlines");
                val=1;            
            } else if(flightCode.substring(0,2).compareTo("MN") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: Manila Airlines");
                val=1;           
            } else if(flightCode.substring(0,2).compareTo("PL") == 0) {
                JOptionPane.showMessageDialog(null, "Flight Operator: Pelangi Airlines");
                val=1;            
            } else {
                JOptionPane.showMessageDialog(null, "Flight operator not found.\nPlease enter the right code\n");
            }
        }
    }

}