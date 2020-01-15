// Prescribed by zubquzaini
import javax.swing.*;
import java.util.Scanner;

public class QuestionTwo {
    
    public static void main() {
        
        System.out.print("\u000C");
        Scanner input = new Scanner(System.in);
        int val, num, countEven=0, countOdd=0;
        String value, number;
        // Console
        System.out.print("Enter an integer: ");
        val = input.nextInt();
        
        for(int x=0; x<val; x++) {
            System.out.print("\nEnter an integer: ");
            num = input.nextInt();  
            
            if(num % 2 == 0) {
                System.out.println("Even Number");
                countEven++;
            } else {
                System.out.println("Odd Number");
                countOdd++;
            }
        }
        
        System.out.println("\nNumber of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
        
        // Output Panel
        val  = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer: "));
        
        for(int x=0; x<val; x++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an integer: "));  
            
            if(num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Even Number");
                countEven++;
            } else {
                JOptionPane.showMessageDialog(null, "Odd Number");
                countOdd++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Number of even numbers: " + countEven + "\nNumber of odd numbers: " + countOdd);
        
    }
}