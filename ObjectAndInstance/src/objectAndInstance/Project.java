package objectAndInstance;

import java.util.ArrayList;

public class Project {

    /**
     * private class method for returning the minimum of the weight objects
     * @param weight1
     * @param weight2
     * @param weight3
     * @return
     */



    //Invoking the lessThan method to compare each instantiation of the set object

    private Weight findMinimum(Weight weight1, Weight weight2, Weight weight3){
        if(weight1.lessThan(weight2) && weight1.lessThan(weight3)){
            return weight1;
        } else if (weight2.lessThan(weight1) && weight2.lessThan(weight3)) {
            return weight2;
        } else if (weight3.lessThan(weight2) && weight3.lessThan(weight1) ) {
        }
        return weight3;
    }
//    private Weight findMaximum

    private Weight findMaximum(Weight weight1, Weight weight2, Weight weight3){
        if(weight2.lessThan(weight1) && weight3.lessThan(weight1)){
            return   weight1;
        } else if (weight1.lessThan(weight2) && weight3.lessThan(weight2)) {
            return weight2;
        } else if (weight1.lessThan(weight3) && weight2.lessThan(weight3)) {

        }
        return weight3;

    }
    // Calculate the average
    private Weight findAverage(Weight weight1, Weight weight2, Weight weight3){
        ArrayList<Weight> weights = new ArrayList<>();
        // Adding the instance objects to the array List
        weights.add( weight1);
        weights.add( weight2);
        weights.add( weight3);

        for(Weight weight : weights){
           weight.weightAverage(weight1., weight2, weight3);
        }

        return weight1;
    }
    public static void main(String[]args){
        Weight weight1 = new Weight(11, 3);
        Weight weight2 = new Weight(7, 20); // Hint: normalize method should be used to translate into 8 pounds and 4 ounces
        Weight weight3 = new Weight(10, 6);

        // Test output of the weight objects
        System.out.println("Weight 1: " +  weight1.toString());
        System.out.println("Weight 2: " + weight2.toString());
    }

}
