package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {


        double totalValue = 0;
        int ageOfVehicle = LocalDate.now().getYear() - year;
        double percent = 0;

        if(ageOfVehicle <= 3){
           percent = 0.03;
        } else if (ageOfVehicle >=4 && ageOfVehicle <= 6) {
           percent = 0.06;
        } else if (ageOfVehicle >= 7 && ageOfVehicle <= 10){
            percent = 0.08;
        } else {
            totalValue = 1000.00;
        }

       if (!(totalValue == 1000)) {
           totalValue = getOriginalCost() * Math.pow(1 - percent, ageOfVehicle);
       }
        if(odometer == 100000 && !makeModel.toLowerCase().contains("honda") || !makeModel.toLowerCase().contains("toyota")){
            totalValue *= 0.75;
        }

        return totalValue;
    }
}
