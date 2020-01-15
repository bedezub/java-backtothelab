public class Schedule
{

    private String code[] = new String[5];
    private String date[] = new String[5];
    private String ship[] = new String[5];
    private String departure[] = new String[5];
    private String arrival[] = new String[5];
    private double price[] = new double[5];
    private int time[] = new int[5];
    private int seat[] = new int[5];
    //private Flight f; 
    
    public Schedule()
    {   
        //f = new Flight();
        
        String code [] = f.getCode();
        double price [] = f.getPrice();
        int seat [] = f.getSeat();
        String date [] = f.getDate();
        int time [] = f.getTime();
        String ship [] = f.getShip();
        String departure [] = f.getDeparture();
        String arrival [] = f.getArrival();
    }


}    