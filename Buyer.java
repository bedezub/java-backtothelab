// Prescribed by zubquzaini

public abstract class Buyer {
    
    private String icNumber;
    private String buyerName;
    private String carRegNum;
    
    public Buyer() {
    
        icNumber = null;
        buyerName = null;
        carRegNum = null;
    }
    
    public Buyer(String i, String b, String c) {
        
        icNumber = i;
        buyerName = b;
        carRegNum = c;
    }
    
    public void setData(String i, String b, String c) {
        
        icNumber = i;
        buyerName = b;
        carRegNum = c;
    }
    
    public String getCarRegNum() {
        
        return carRegNum;
    }
    
    public String getBuyerName() {
        
        return buyerName;
    }
    
    public String getICNumber() {
        
        return icNumber;
    }
    
    public abstract double carPrice();
}