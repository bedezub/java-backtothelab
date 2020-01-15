// Prescribed by zubquzaini

public class Flight {
    
    private String code[] = new String[5];
    private String date[] = new String[5];
    private String ship[] = new String[5];
    private String departure[] = new String[5];
    private String arrival[] = new String[5];
    private double price[] = new double[5];
    private int time[] = new int[5];
    private int seat[] = new int[5];
    private double profit;
    private int collection;
    
    // Composite class
    private String codes;
    private int numOfTicket;
    private String name;
    private String promoCode;
    private double payment;
    
    // Users stuff
    private String username;
    private String phoneNum;    

    public Flight() {
        
        code[0]="Do717"; price[0]= 171; seat[0]=60; date[0]= "12/12/18"; time[0]= 1700; ship[0]= "MH717"; departure[0]= "KLIA"; arrival[0]= "London";
        code[1]="Do766"; price[1]= 211; seat[1]=60; date[1]= "12/12/18"; time[1]= 2100; ship[1]= "MH068"; departure[1]= "KLIA"; arrival[1]= "Lisbon";
        code[2]="Do881"; price[2]= 330; seat[2]=60; date[2]= "15/12/18"; time[2]= 2000; ship[2]= "MH118"; departure[2]= "KLIA"; arrival[2]= "Moscow";
        code[3]="Do990"; price[3]= 250; seat[3]=60; date[3]= "17/12/18"; time[3]= 1700; ship[3]= "MH881"; departure[3]= "KLIA"; arrival[3]= "Riyadh";
        code[4]="Do321"; price[4]= 240; seat[4]=60; date[4]= "18/12/18"; time[4]= 2100; ship[4]= "MH552"; departure[4]= "KLIA"; arrival[4]= "Taipei";
        
        // Admin
        profit = 0.00;
        collection = 0;
        
        // Booking
        codes = null;
        numOfTicket = 0;
        name = null;
        promoCode = null;
        payment = 0.0;
        
        // User Stuff
        username = "";
        phoneNum = "";
    }
    
    // User setter
    public void setData(String u, String pn) {
    
        username = u;
        phoneNum = pn;
    }
    
    // Admin Setter
    public void setProfit(double p) {
        profit = p;
        calcProfit();
    }
    
    public void setCollection(int c) {
        collection = c;
        calcCollection();
    } 
    
    // Booking Setter
    public void setCode(String c) {
        codes = c;
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
    
    // Flight 
    public int getKey(String code) {
        int key = 5;
        boolean val = false;
        String codes[] = getCode();
        
        if(code.equals("")) {
            val = false;
        } else {
            for(int x=0; x<5; x++) {
                if(codes[x].equalsIgnoreCase(code)) {
                    key = x;
                    val = false;
                    break;
                } else {
                    val=true;
                }
            }        
        }

        if(val) {
            System.out.print("Invalid code!. Please try again\n");
            key = 5;
        }
        
        return key;
    }
    
    public String getUsername() {
        
        return username;
    }
    
    public String getPhoneNum() {
        
        return phoneNum;
    }

    public String [] getCode()
    {   
        return code;
    }

    public String [] getDate()
    {
        return date;
    }

    public String [] getShip()
    {
        return ship;
    }
    
    public String [] getDeparture()
    {
        return departure;
    }
    
    public String [] getArrival()
    {
        return arrival;
    }
    
    public double [] getPrice()
    {
        return price;
    }
    
    public int [] getTime()
    {
        return time;
    }
    
    public int [] getSeat()
    {
        return seat;
    }
    
    public String getCodes() {
        return codes;
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
    
    public double calcProfit() {
        double totalSales = 0;
        totalSales = totalSales + profit;
        
        return totalSales;
    }
    
    public int calcCollection() {
        int totalCollection = 0;
        totalCollection = totalCollection + collection;
        return totalCollection;
    }
    
    public boolean checkPassword(String passwd) {
        boolean val = false;
        
        if(passwd.equals("ilove2fly")) {
            val = true;
        } else {
            val = false;
        }
        
        return val;
    }
    
    public String toString() {
        
        return ("Total sales earned: RM" + calcProfit() + "\nTotal daily collection:" + calcCollection());
    } 
    
    public void showTable() {
        
        System.out.println("| Code  | Price(RM) | Num Seat |   Date   |  Time  |  Ship  | Departure |    Arrival   |");
        for(int x=0; x<5; x++) {
            System.out.println("| " + code[x] + " |   " + price[x] + "   |    " + seat[x] + "    | " + date[x] + " |  " + time[x] + "  |  " + ship[x] + " |   " + departure[x] + "    |    " + arrival[x] + "    |");
        }
    }
    
        public double getPrices() {
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