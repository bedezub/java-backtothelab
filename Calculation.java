// Prescribed by zubquzaini

import javax.swing.*;
import java.util.Scanner;

public class Calculation {
    
    public static void main() {
        
        String name;
        int num, repeat=1;
        
        System.out.print("\u000C");
        Scanner input = new Scanner(System.in);
        while(repeat == 1) {
        
            System.out.print("Enter your name: ");
            name = input.next();
            
            System.out.println("\nHello " + name + "!");
            
            System.out.print("\nEnter a positive number: ");
            num = input.nextInt();
            
            if(num >= 0) {
                System.out.println("Your favourite number is: " + num + "!");
            } else {
                System.out.println("Not a positive number!");
            }
            
            System.out.print("\n\nRepeat: 1-Yes: "); 
            repeat = input.nextInt();
        }
    }
        
}
    