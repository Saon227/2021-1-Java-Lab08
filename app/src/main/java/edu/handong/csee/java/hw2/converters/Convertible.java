package edu.handong.csee.java.hw2.converters;
/**
 * This is a Convertible class
 */
public interface Convertible {
    /**
     * This is a setFromValue method that set value
     * @param double fromValue
     */
    public void setFromValue(double fromValue);
    /**
     * This is a getConvertedValue method that return value
     */
    public double getConvertedValue();
    /**
     * This is a convert method
     */
    public void convert();

}