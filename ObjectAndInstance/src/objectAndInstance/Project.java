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

    //Invoking the lessThan method for

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
            return weight1;
        } else if (weight1.lessThan(weight2) && weight3.lessThan(weight2)) {
            return weight2;
        } else if (weight1.lessThan(weight3) && weight2.lessThan(weight3)) {

        }
        return weight3;
    }
    private static void main(String[]args){
        
    }
}
