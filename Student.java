// Prescribed by zubquzaini
public class Student {
    
    private String name;
    private String group;
    private double score1;
    private double score2;
    private double score3;
    
    public Student() {
        
        name = "";
        group = "";
        score1 = 0.0;
        score2 = 0.0;
        score3 = 0.0;
    
    }
    
    public void setData(String n, String g, double s1, double s2, double s3) {
    
        name = n;
        group = g;
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }
    
    public String getName() {
        
        return name;
    }
    
    public String getGroup() {
        
        return group;
    }
    
    public double getScoreOne() {
        
        return score1;
    }
    
    public double getScoreTwo() {
        
        return score2;
    }
    
    public double getScoreThree() {
        
        return score3;
    }
    
    public double calAverage() {
        
        double average=(score1 + score2 + score3) / 3;
        return average;
    } 
    
    public String toString() {
    
        return ("Name: " + name + "\nGroup: " + group + "\nScore 1: " + score1 + "\nScore 2: " + score2 + "\nScore 3: " + score3);
    }
}   