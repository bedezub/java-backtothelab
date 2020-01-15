// Prescribed by zubquzaini

public class CustOrder {

    private String custName;
    private String contactNumber;
    private Date date;
    private int numberOfGuest;
    private char custPackage;
    
    public CustOrder(String name, String number, int d, int m, int y, int guest, char cust) {
        
        custName = name;
        contactNumber = number;
        date = new Date(d, m, y);
        numberOfGuest = guest;
        custPackage = cust;
        
    }
    
    public void setName(String n) {
        
        custName = n;
    }
    
    public String getName() {
        return custName;
    }
    
    public String getContact() {
        return contactNumber;
    }
    
    public String getDate() {
        return date.toString();
    }
    
    public int getGuest() {
        return numberOfGuest;
    }
    
    public char getPackage() {
        return custPackage;
    }
    
    public int getDay() {
        return date.getDay();
    }
    
    public int getMonth() {
        return date.getMonth();
    }
    
    public int getYear() {
        return date.getYear();
    }
    
    public double calcTotal() {
        double total=0;
        
        if(getPackage() == 'A') {
            total = 30000;
        } else if(getPackage() == 'B') {
            total = 25000;
        } else if(getPackage() == 'C') {
            total = 15000;
        } else {
            System.out.println("Invalid package");
        }
        
        if(getGuest() > 1000) {
            
            total = total * 0.9;
        }
        
        return total;
    }
    
    public String toString() {
        return "Customer name: " + getName() + "\nContact number : " + getContact() + "\nWedding date: " + getDay() + "/" + getMonth() + "/" + getYear() + "\nNumber of guest: " + getGuest() + "\nCustomer package: " + getPackage() + "\nTotal Package (RM): " + calcTotal();
    }
}