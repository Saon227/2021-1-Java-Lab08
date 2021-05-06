package edu.handong.csee.java.hw2.converters;
/**
 * This is a MILEToKMConverter class and it implement Convertible class
 * MILE to KM
 */
public class MILEToKMConverter implements Convertible {

    private double value;
    /**
     * This is a setFromValue method that set value
     * @param double fromValue
     */
    public void setFromValue(double fromValue){
        value = fromValue;
    }
    /**
     * This is a getConvertedValue method that return value
     */
    public double getConvertedValue(){
        return value;
    }
    /**
     * This is a convert method that convert MILE to KM
     */
    public void convert(){
        value = value*1.6;
    }
}