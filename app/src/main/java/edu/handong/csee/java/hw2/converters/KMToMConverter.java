package edu.handong.csee.java.hw2.converters;
/**
 * This is a KMToMConverter class and it implement Convertible class
 * KM to M
 */
public class KMToMConverter implements Convertible {

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
     * This is a convert method that convert KM to M
     */    
    public void convert(){
        value = value * 1000.0;
    }
}