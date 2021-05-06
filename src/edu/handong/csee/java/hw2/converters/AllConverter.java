package edu.handong.csee.java.hw2.converters;

/**
 * This is a AllConverter class
 */
public class AllConverter{

    private double fromvalue;
    private String originalMeasure;
    /**
     * This is a setFromValue method that set value and return it
     * @param double fromValue
     */
    public AllConverter setFromValue(double fromValue){
        this.fromvalue = fromValue;
        return this;
    }
    /**
     * This is a setOriginalMeasure method that set originalMeasure and return it
     * @param String originalMeasure
     */    
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;
        return this;
    }
    /**
     * This is a convertAndPrintOut method and it showes convert from KM and TON
     */        
    public void convertAndPrintOut(){
        if(originalMeasure.equals("KM")){
            System.out.println(fromvalue + " KM to " + fromvalue*1000.0 + " M");
            System.out.println(fromvalue + " KM to " + fromvalue/1.6 + " MILE");
        }
        else if(originalMeasure.equals("TON")){
            System.out.println(fromvalue + " TON to " + fromvalue*1000.0 + " KG");
            System.out.println(fromvalue + " TON to " + fromvalue*1000000.0 + " G");
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
        }
    }
}