// Prescribed by zubquzaini

public class Shoes {
    
    private String name;
    private String brand;
    private String colour;
    private double price, priceAfterDiscount;
   
    
    public Shoes() {
        
        name = null;
        brand = null;
        colour = null;
        price = 0.0;
    }
    
    public void setData(String n, String b, String c, double p) {
    
        name = n;
        brand = b;
        colour = c;
        price = p;
    }
    
    public String getName() {
        
        return name;
    }
    
    public String getBrand() {
        
        return brand;
    }
    
    public String getColour() {
         
        return colour;
    }   
    
    public double getPrice() {
        
        return price;
    }
    
    public double calcDiscount() {
        
        if(price >=300 && price < 700) {
            
            priceAfterDiscount = price * 0.95;
        } else if(price >= 700) {
            
            priceAfterDiscount = price * 0.90;
        }
        
        return priceAfterDiscount;
    }
    
    public String toString() {
        
        return ("\nShoes Information:\n   Owner's Name: " + name + "\n   Brand: " + brand + "\n   Colour:" + colour + "\n   Price: RM" + price + "\n   Price After Discount: RM" + priceAfterDiscount);
    }

}