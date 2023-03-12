package objectAndInstance;

public class Weight {
    private static final double OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;


    //Constructor
    public Weight (int pounds, double ounces){
        if(pounds <= 0 || ounces <= 0){
            throw new IllegalArgumentException("Neither pounds nor ounces can be less" +
                    " or equal to 0 ");
        }else {
            this.pounds = pounds;
            this.ounces = ounces;
        }
    }

    public double toOunces(){
      double poundsToOunces = pounds * 16;
      return poundsToOunces;
    }
}
