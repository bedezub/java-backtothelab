// Prescribed by zubquzaini

public class Magazine {

    private String title;
    private int numberPage;
    private String material;
    
    public Magazine(String t, int num, String mat) {
        
        title = t;
        numberPage = num;
        material = mat;
        
    }
    
    public void setMagazine(String t, int num, String mat) {
        
        title = t;
        numberPage = num;
        material = mat;
        
    }
    
    public String getTitle() {
    
        return title;
    }
    
    public int getNumPage() {
    
        return numberPage;
    }
    
    public String getMatarial() {
        
        return material;
    }
    
    public double calcCost() {
        
        double cost = 0.00;
        
        if(material.equalsIgnoreCase("Gamblo")) {
            cost = numberPage * 0.08 + (1.5 * 4.8);
        } else if(material.equalsIgnoreCase("Wood")) {
            cost = numberPage * 0.08 + (1.5 * 5.5);
        }
        
        return cost;
    }
    
    public String toString() {
        
        return "\nTitle: " + title + "\nNumber of Pages: " + numberPage + "\nMaterial: " + material;

    }

}