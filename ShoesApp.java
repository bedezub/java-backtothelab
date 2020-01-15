// Prescribed by zubquzaini

import java.util.*;

public class ShoesApp {
    
    public static void main(String args[]) {
        
        String name;
        String brand;
        String colour;
        String display = "";
        double price;
        int count=0;
        int countTimberland=0;
        
        Scanner in = new Scanner(System.in);
        Shoes s = new Shoes();
        
        System.out.println("Enter YES to proceed / NO to stop");
        String enter = in.nextLine();
        
        while(enter.equalsIgnoreCase("YES")) {
            in.nextLine();
            System.out.print("Enter your name: ");
            name = in.nextLine();
            
            System.out.print("Enter your brand: ");
            brand = in.nextLine();
            
            System.out.print("Enter your colour: ");
            colour = in.nextLine();
            
            System.out.print("Enter your price: ");
            price = in.nextDouble();
            
            s.setData(name, brand, colour, price);
            s.calcDiscount();
            
            
            count++;
            
            if(brand.equalsIgnoreCase("Timberland")) {
                countTimberland++;
            }
            display = display + "\n" + s.toString();
            
            System.out.println("\nEnter YES to proceed / NO to stop");
            enter = in.next();
        }
    
        System.out.print("\nAll the information: \n" + display);
        System.out.println("\n\nTotal Data Entered by User: " + count);
        System.out.println("Total Timberland Shoes: " + countTimberland);
        
    }

}