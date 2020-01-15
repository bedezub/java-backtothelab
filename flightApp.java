// prescribed by zubquzaini
import java.util.*;
import java.io.*;

public class flightApp {
    
    public static void main(String [] args) throws Exception {
       
        System.out.println("\u000c");        
        Scanner sc = new Scanner(System.in);
        
        // Delcaration variable. Passing variable to definition classs
        int option=0, numOfTicket=0, count=0;
        double payment = 0.0;
        String code = "";

        // Initialization file I/O
        FileWriter fw=new FileWriter("receipt.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        
        System.out.print("\nEnter name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();   
        System.out.println("\u000c");  
        
        // Initialization Object
        Admin a = new Admin();
       
       
        while(option==0) {
            
            for(int x=0; x < 41; x++) {
                System.out.print("*");      
            }
            
            System.out.println("");
            System.out.println("\tWelcome to Fly Malaya\t");
            
            for(int x=0; x < 41; x++) {
                System.out.print("*");      
            }
            
            System.out.print("\n\n\tSelect Option:\n\t1-Book Ticket\n\t2-Check Schedule\n\tOption: ");
            option = sc.nextInt();
            System.out.println("\u000c");
            
            if(option == 1) {
                boolean resume = true;
                a.showTable();
                
                while(a.getKey(code) == 5) {
                    System.out.print("\nEnter code :");
                    code=sc.next();
                }
                
                System.out.print("Enter number of tickets :");
                numOfTicket = sc.nextInt();
                
                Client c = new Client(name, phone, code, numOfTicket);
                System.out.println("\u000c");
                sc.nextLine();
                System.out.println("Total price is RM" + c.calcTotal() + "\nEnter promo code 'Superfly' during checkout to receive 5% discount");
                
                System.out.print("Enter promo code:");
                String promoCode = sc.nextLine();
                c.setPromo(promoCode);
                
                System.out.println("\nPrice after discount: RM" + c.calcDiscount());
                
                System.out.print("Enter your payment :");
                payment = sc.nextDouble();
                c.setPayment(payment);
                
                while(c.calcBalance() < 0) {
                    System.out.print("\nInsufficient amount!. \nEnter your payment :");
                    payment = sc.nextDouble();
                    c.setPayment(payment);
                }

                pw.println("******************************");
                pw.println("            RECEIPT           ");
                pw.println("******************************");
                pw.println("Name: " + c.getUsername());
                pw.println("Phone Number: " + c.getPhoneNum());
                pw.println("Code:" + c.getCodes());
                pw.println("Number of ticket:" + c.getNumOfTicket());
                pw.println("Price:RM" + c.getPrices());
                pw.println("Date:" + c.getDates());
                pw.println("Time:" + c.getTimes());
                pw.println("Depart:" + c.getDepart());
                pw.println("Arrival:" + c.getArrivals());
                pw.println("******************************");
                pw.println("Price: RM" + c.calcTotal());
                pw.println("Price after discount:RM" +  c.calcDiscount());
                pw.println("Payment:RM" + c.getPayment());
                pw.printf("Balance:RM%.2f", c.calcBalance());
                pw.println("******************************");
                pw.println("THANK YOU PLEASE COME AGAIN\n");
                
                System.out.println("Succeed!");
                
                System.out.println("\u000c");
                sc.nextLine();
                c.display();
                System.out.println("Enter any key to return to main menu");
                sc.nextLine();
                
                count++;
                a.setProfit(c.calcDiscount());
                a.setCollection(count);
                
                System.out.println("\u000c");
                
                pw.close();
                
                code="";
                option= 0;
            } else if(option == 2) {
                sc.nextLine();
                
                a.showTable();
                System.out.println("\nEnter any key to return to main menu");
                sc.nextLine();
                System.out.println("\u000c");
                option=0;
            } else if(option == 3) {
                String passwd = ""; 
                FileReader fr=new FileReader("receipt.txt");
                BufferedReader br=new BufferedReader(fr);
                sc.nextLine();
                System.out.println("\u000c");
                System.out.println("Warning!!! This is for authorize person only!!!\n\tProceed at your own risk. Code: ");
                passwd = sc.nextLine();
                
                if(a.checkPassword(passwd)) {
                    System.out.println("\u000c");
                    System.out.println(a.toString() + "\n");
                    String inline=br.readLine();
                    while(inline!=null){
                       System.out.println(inline);
                       inline=br.readLine();
                    }
               
                    System.out.println("\nEnter any key to return to main menu");
                    sc.nextLine();
                    System.out.println("\u000c");
                    option=0;
                    br.close();
                } else {
                    System.out.println("\u000c");
                    option=0;
                    br.close();
                }
            } else {
                    System.out.println("\u000c");
                    option=0;
            }
        }
    }
}