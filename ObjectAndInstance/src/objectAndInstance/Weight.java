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

    private double toOunces(){
      return pounds * 16;
    }
    private void normalize(){
        if(toOunces() < Weight.OUNCES_IN_A_POUND ) System.out.println("Under ounces in a pound");
        else throw new IllegalArgumentException("The converted ounces cannot be greater than the number of" +
                " ounces in a pound.");
    }

    public boolean lessThan(Weight weight){
        return true; //Working on implementation
    }

    public void addTo(Weight weight){
        //implementation
    }

    public String toString(){
        return "1"; // Working on implementation.
    }
}
