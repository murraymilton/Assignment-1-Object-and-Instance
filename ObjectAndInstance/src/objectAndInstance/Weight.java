package objectAndInstance;

public class Weight {
    /**
     * Instance Variable Declaration
     */
    private final double OUNCES_IN_A_POUND = 16; 
    private int pounds;
    private double ounces;


    //Construtor
    public Weight(int pounds){
        this.pounds = pounds;
        this.ounces = ounces;
    }

    //Instance Methods
    public double toOunces(){
        return this.pounds * OUNCES_IN_A_POUND;
    }

    public void normalize(){
        if(toOunces() > OUNCES_IN_A_POUND){
            throw new IllegalArgumentException("Error: The converted Ounces are greater than ounces per pound.");
        }else
             this.ounces = toOunces();

    }

    public boolean lessThan(Weight weight){
        if(weight.ounces > OUNCES_IN_A_POUND){
            return false;
        }else return true;
    }

    public void addTo(Weight weight){}
    //Accessor and Mutator Methods
    public double getOUNCES_IN_A_POUND() {
        return OUNCES_IN_A_POUND;
    }

    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    public double getOunces() {
        return ounces;
    }

    public void setOunces(double ounces) {
        this.ounces = ounces;
    }




    public String toString(){
      return "x:" + pounds + " and " + " y:" + ounces;
    }
}
