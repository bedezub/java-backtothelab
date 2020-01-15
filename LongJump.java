// Prescribed by zubquzaini

public class LongJump {

    private int athId;
    private String athName;
    private String teamCode;
    private double jumpDistance[] = new double[3];
    
    public LongJump(int id, String name, String code, double distance[]) {
        
        athId = id;
        athName = name;
        teamCode = code;
        
        for(int x=0; x<3; x++) {
            
            jumpDistance[x] = distance[x];
        }
    }
    
    
    public void setData(int id, String name, String code, double distance[]) {
        athId = id;
        athName = name;
        teamCode = code;
        
        for(int x=0; x<3; x++) {
            
            jumpDistance[x] = distance[x];
        }
    }
    
    public int getId() {
        return athId;
    }
    
    public String getName() {
        return athName;
    }
    
    public String getCode() {
        return teamCode;
    }
    
    public double[] getDistance() {
        return jumpDistance;
    }
    
    public double calcAverage() {
        double avrg=0;
        
        for(int x=0; x<3; x++) {
            avrg = avrg + jumpDistance[x];
        }
        
        avrg = avrg/3;
        return avrg;
    }
    
    public double bestAttempt() {
        double best = 0;
        for(int x=0; x<3; x++) {
            if(best < jumpDistance[x]) {
                best = jumpDistance[x];
            }
        }
        
        return best;
    }
    
    public String detStatus() {
        String status = "";
        
        if(calcAverage() >= 7.00) {
            status = "Qualified";
        } else if(calcAverage() >= 5.00 && calcAverage() < 7.00) {
            status = "Reserve";
        } else {
            status = "Disqualified";
        }
        
        return status;
    }
    
    public String toString() {

        return ("Athele ID: " + athId + "\nAthele Name: " + athName + "\nTeam Code: " + teamCode + "\nJump distance: " + "\nDistance 1: " + jumpDistance[0] + "\nDistance 2: " + jumpDistance[1] + "\nDistance 3: " + jumpDistance[2] + "\nAverage Jump distance: " + calcAverage() + "m\nStatus" + detStatus());
    }

}





