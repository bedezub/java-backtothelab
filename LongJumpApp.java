// Prescribed by zubquzaini
import java.util.*;

public class LongJumpApp {
    
    public static void main() {
        
        Scanner sc = new Scanner(System.in);
        LongJump l[] = new LongJump[3];
        
        int id;
        String name;
        String code;
        double jumpDistance[] = new double[3];
        
        for(int x=0; x<3; x++) {
            
            System.out.print("Enter athlete id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter athlete name: ");
            name = sc.nextLine();
            
            System.out.print("Enter team code: ");
            code = sc.next();
            
            for(int i=0; i<3; i++) {
                System.out.print("Enter jump distance " + i+1 + ": ");
                jumpDistance[i] = sc.nextDouble();
            }
            l[x] = new LongJump(id, name, code, jumpDistance);
            System.out.print("\n");
        }
        
        System.out.println("Display all athelete informations");
        
        for(int x=0; x<3; x++) {
            double distance[] = l[x].getDistance();
            
            System.out.println("\n\nAthlete id: " + l[x].getId());
            System.out.println("Athlete name: " + l[x].getName());
            System.out.println("Team code: " + l[x].getCode());
            System.out.println("Jump distance are");
            
            for(int i=0; i<3; i++) {
                System.out.println("Distance " + i+1 + ": " + distance[i]);
            }
            
            System.out.println("Average jump distance" + l[x].calcAverage() + "m");
            System.out.println("Status: " + l[x].detStatus());
        }
        
        
        System.out.println("\n===========================================\n");
        int ind = 0;
        for(int x=0; x<3; x++) {
            double best = 0;

            if(l[x].bestAttempt() < best) {
                best = l[x].bestAttempt();
                ind = x;
            }
        }
        
        System.out.println("The winner of that event is: ");
        System.out.println("Athelete name: " + l[ind].getName());
        System.out.println("The longest jump distance: " + l[ind].bestAttempt());
        
        double sum = 0;
        for(int x=0; x<3; x++) {
            sum = sum+l[x].calcAverage();
        }
        
        System.out.println("The average distance for all jumps by athelete are: " + sum/3);
    }
}