package com.company;

import java.util.Date;

public class WaterHeater extends ServiceCall {

    private String waterHeaterAge;
    private static double cityFee = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, String waterHeaterAge) {
        super(serviceAddress, problemDescription, date);
        this.waterHeaterAge = waterHeaterAge;
    }

    @Override
    public String toString() {

        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String totalFee = Double.toString(fee + cityFee);


        return "Water Heater Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Water Heater Age = " + waterHeaterAge + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Service Fee = " + feeString + "\n" +
                "City Fee = " + cityFee + "\n" +
                "Service Fee = " + totalFee;

    }
}
