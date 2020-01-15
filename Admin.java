// prescribed by zubquzaini
public class Admin extends User {
    
    private double profit;
    private int collection;

    public Admin() {

        profit = 0.00;
        collection = 0;
    }
    
    public void setData(String u, String pn) {
        super.setData(u, pn);
    }
    
    public void setProfit(double p) {
        profit = p;
        calcProfit();
    }
    
    public void setCollection(int c) {
        collection = c;
        calcCollection();
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
}