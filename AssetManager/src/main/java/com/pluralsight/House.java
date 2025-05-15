package com.pluralsight;

public class House extends Asset {

    private String address;
    private int condition;
    private int lotSize;
    private int squareFoot;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.lotSize = lotSize;
        this.squareFoot = squareFoot;
    }

    private int getSquareFoot(){
        return squareFoot;
    }

    public void setSquareFoot(){
        this.squareFoot = squareFoot;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double costPerSquareFoot = 0;

        if(condition == 1){
            costPerSquareFoot = 180.00;
        } else if (condition == 2){
            costPerSquareFoot = 130.00;
        } else if (condition == 3){
            costPerSquareFoot = 90.00;
        } else if (condition == 4){
            costPerSquareFoot = 80.00;
        }

        double totalCost = (squareFoot * costPerSquareFoot) + (lotSize * 0.25);

        return totalCost;
    }
}
