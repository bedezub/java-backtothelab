import java.text.*;

public class booking
{
    public booking ()
    {
       code = null;
       numOfTicket = 0;
       name = null;
       promoCode = null;
       payment = 0.0;
    }
    
    public void setCode(String c) {
        code = c;
    }
    
    public void setNumTickets(int NOT) {
        numOfTicket = NOT;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setPromo(String PC) {
        promoCode = PC;
    }
    
    public void setPayment(double pay) {
        payment = pay;
    }
    
    public String getCodes() {
        return code;
    }
    
    public int getNumOfTicket ()
    {
        return numOfTicket;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public String getPromo ()
    {
        return promoCode;
    }
    
    public double getPayment()
    {
        return payment;
    }
    
    public double getPrices() {
        double prices [] = super.getPrice();
        return prices[super.getKey(code)];
    }
    
    public int getTimes() {
        int times [] = super.getTime();
        return times[super.getKey(code)];
    }
    
    public String getDates() {
        String date [] = super.getDate();
        return date[super.getKey(code)];        
    }
    
    public String getDepart() {
        String depart[] = super.getDeparture();
        return depart[super.getKey(code)];  
    }
    
    public String getArrivals() {
        String arrival[] = super.getArrival();
        return arrival[super.getKey(code)];      
    }
    
    public double calcTotal()
    {
        double total=0.0;
        double prices [] = super.getPrice();
        
        total=prices[super.getKey(code)] * numOfTicket;
        return total;
    }
    
    public double calcDiscount()
    {
        double priceAfterDiscount=0.0;
        String promoCode = getPromo(); 
        
        if(promoCode.equalsIgnoreCase("Superfly"))
        {
            priceAfterDiscount=calcTotal() * 0.95;
        } else {
            priceAfterDiscount=calcTotal();
        }
 
        return priceAfterDiscount; 
    }
    
    public double calcBalance() {
        double balance = 0.00;
        balance=payment-calcDiscount();
        return balance;
    }
    
    public void display() {
    
        System.out.println("******************************");
        System.out.println("            RECEIPT           ");
        System.out.println("******************************");
        System.out.println("Code:" + getCodes());
        System.out.println("Number of ticket:" + getNumOfTicket());
        System.out.println("Price:RM" + getPrices());
        System.out.println("Date:" + getDates());
        System.out.println("Time:" + getTimes());
        System.out.println("Depart:" + getDepart());
        System.out.println("Arrival:" + getArrivals());
        System.out.println("******************************");
        System.out.println("Price:" + calcTotal());
        System.out.println("Price after discount:RM" +  calcDiscount());
        System.out.println("Payment:RM" + getPayment());
        System.out.println("Balance:RM" + calcBalance());
        System.out.println("******************************");
        System.out.println("THANK YOU PLEASE COME AGAIN\n");
    }
}
