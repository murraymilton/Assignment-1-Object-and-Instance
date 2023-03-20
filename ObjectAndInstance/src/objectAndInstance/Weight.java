package objectAndInstance;

public class Weight {
    /**
     * Instance variables
     * constant --> OUNCES_IN_POUNDS initialized to 16 for converting ounces to pounds
     */
    private final double OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    /**
     * The default constructor of initialize the instances of each object.
     * @param pounds
     * @param ounces
     */

    public Weight(int pounds, double ounces){
        //implementation ----> Validating the

        this.pounds = pounds;
        this.ounces = ounces;
        // Checking the initialized values of a 
        normalize(); // Passing
    }


    /**
     *
     * @return returning the converted number of pounds to ounces
     */
    public double toOunces(){
        return pounds * OUNCES_IN_A_POUND + ounces;
    }

    // Method for validating the number of ounces is less than the number of ounces in a pound.
    private void normalize(){
        while(ounces > OUNCES_IN_A_POUND){
            ounces -= 16;
            pounds++;
        }
    }

    /**
     * Boolean method for evaluating that the pounds are greater than ounces
     */

    public boolean lessThan(Weight weight){
        if(weight.pounds < weight.ounces) {
            return true;
        }
        else if(weight.pounds > weight.ounces) {

        }return false;
    }

    public void addTo(Weight weight){
        this.pounds = weight.pounds;
        this.ounces = weight.ounces;

        normalize();

    }

    public void weightAverage(int w){
        ounces = toOunces();

        pounds = 0;

        ounces = ounces / w;

        normalize();
    }

    // Creating a toString() method for representing each object of the instance of each object.
    public String toString(){
        return " Pounds:" + pounds + String.format("%.2f", ounces) + " oz";
    }
}

