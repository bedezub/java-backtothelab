// Prescribed by zubquzaini
public class Client extends User {
   
    private String code;
    private int numOfTicket;
    private String promoCode;
    private double payment;
    
    public Client(String u, String pn, String c, int num) {
        
        super.setData(u, pn);
        code = c;
        numOfTicket = num;
    }
    
    public void setPromo(String p) {
        promoCode = p;
    }
    
    public void setPayment(double p) {
        payment = p;
    }
    
    public String getCodes() {
        return code;
    }
    
    public int getNumOfTicket ()
    {
        return numOfTicket;
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
        return prices[getKey(code)];
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
        System.out.println("Name:" + getUsername());
        System.out.println("Phone Number:" + getPhoneNum());
        System.out.println("Code:" + getCodes());
        System.out.println("Number of ticket:" + getNumOfTicket());
        System.out.println("Price:RM" + getPrices());
        System.out.println("Date:" + getDates());
        System.out.println("Time:" + getTimes());
        System.out.println("Depart:" + getDepart());
        System.out.println("Arrival:" + getArrivals());
        System.out.println("******************************");
        System.out.println("Price: RM" + calcTotal());
        System.out.println("Price after discount:RM" +  calcDiscount());
        System.out.println("Payment:RM" + getPayment());
        System.out.printf("Balance:RM%.2f", calcBalance());
        System.out.println("******************************");
        System.out.println("THANK YOU PLEASE COME AGAIN\n");
    }
}