package objectAndInstance;

public class Weight {
    /**
     * Instance Variable Declaration
     */
    private final double OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;


    //Construtor
    public Weight(int pounds, double ounces){
        this.pounds = pounds;
        this.ounces = ounces;

    }

    

    //Instance Methods
    public double toOunces(){
        return pounds * OUNCES_IN_A_POUND;
    }

    public void normalize(){
      while(toOunces() > OUNCES_IN_A_POUND){
          ounces -= OUNCES_IN_A_POUND;
          pounds++;
      }

    }



    public void addTo(Weight weight){
        if(weight.toOunces() < OUNCES_IN_A_POUND){
            this.ounces = toOunces();
            this.pounds = pounds;
        }else  throw new IllegalArgumentException("Converted ounces greater than "
                + OUNCES_IN_A_POUND);

    }


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


    //toString() --> for return a string representation of the object instance.

    public String toString(){
      return "x:" + pounds + " and " + " y:" + ounces;
    }
}
