// Prescribed by zubquzaini
import java.util.*;

public class carApp {

    public static void main() {
        
        Buyer b[] = new Buyer[5];
        Scanner sc = new Scanner(System.in);
        int newBuyer=0, usedBuyer=0, wareHouseCar=0;
        String display = "";
        
        for(int x=0; x<5; x++) {
            sc.nextLine();
            System.out.print("\nEnter name: ");
            String name = sc.nextLine(); 
            
            System.out.print("Enter ic number: ");
            String ic = sc.nextLine();
            
            System.out.print("Enter car registration number: ");
            String carReg = sc.nextLine(); 
            
            System.out.print("New car (N) / Used car (U): ");
            String carType = sc.next();
            
            if(carType.equalsIgnoreCase("N")) {
                
                System.out.print("Enter import duty: ");
                double importDuty = sc.nextDouble();
                
                System.out.print("Enter price before import duty: ");
                double b4importDuty = sc.nextDouble();
                
                System.out.print("Is the car in warehouse? (True/False): ");
                boolean wareHouse = sc.nextBoolean();
                
                if(wareHouse) {
                    wareHouseCar++;
                }
                
                newBuyer++;
                b[x] = new NewCar(ic, name, carReg, importDuty, b4importDuty, wareHouse);
            } else {
                
               System.out.print("Enter year made: ");
               int yearMade = sc.nextInt(); 
               
               System.out.print("Enter depreciation rate: ");
               double depRate = sc.nextDouble();
               
               System.out.print("Enter original car price: RM");
               double oriPrice = sc.nextDouble();
               
               System.out.print("Local or Imported: ");
               String localImported = sc.nextLine();
               
               usedBuyer++;
               b[x] = new UsedCar(ic, name, carReg, yearMade, depRate, oriPrice, localImported);
               
               display = display + "\n" + b[x].toString();
            }
        }
        
        System.out.println("\nNumber of used car buyer: " + usedBuyer);
        System.out.println("Number of used car buyer: " + newBuyer);
        System.out.println("Number of car in warehouse: " + wareHouseCar);
        System.out.println(display);
    }
}