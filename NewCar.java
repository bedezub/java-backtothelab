// Prescribed by zubquzaini

public class NewCar extends Buyer {
    
    private double importDuty;
    private double priceB4ImportDuty;
    private boolean wareHouse;
    
    public NewCar() {
        
        importDuty = 0.0;
        priceB4ImportDuty = 0.0;
        wareHouse = false;
    }
    
    public NewCar(String ic, String n, String r, double i, double p, boolean w) {
        
        super.setData(ic, n, r);
        importDuty = i;
        priceB4ImportDuty = p;
        wareHouse = w;
    }
    
    public double getImportDuty() {
        
        return importDuty;
    }
    
    public boolean getWareHouse() {
        
        return wareHouse;
    }
    
    public double getPriceB4ImportDuty() {
        
        return priceB4ImportDuty;
    }
    
    public void setData(double i, double p, boolean w) {
        
        importDuty = i;
        priceB4ImportDuty = p;
        wareHouse = w;
    }
    
    public double carPrice() {
        
        double price = 0.0;
        if(wareHouse) {
            
             price = priceB4ImportDuty + 1500 + importDuty;
        } else {
            price = priceB4ImportDuty + importDuty;
        }
        
        return price;
    }
}