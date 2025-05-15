package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assetArray = new ArrayList<>();

        assetArray.add(new House(" Residential",
                "2016-01-01",
                350000,
                "123 Something Street",
                3,
                9000));
        assetArray.add(new House("Vacation",
                "2024-02-02",
                500000,
                "567 Nice Road",
                1,
                12000));
        assetArray.add(new Vehicle("Personal Vehicle",
                "2017-03-14",
                20000,
                "Honda Accord",
                2014,
                92000));
        assetArray.add(new Vehicle("Luxury Vehicle",
                "2024-05-09",
                500000,
                "Rolls Royce Phantom",
                2023,
                10000 ));


        for (Asset stuff : assetArray){
            System.out.println("Description: " + stuff.getDescription());
            System.out.println("Date Acquired: " + stuff.getDateAcquired());
            System.out.println("Original Cost: " + stuff.getOriginalCost());
            System.out.println("Current Value: " + stuff.getValue());

            if (stuff instanceof House) {
                House roof = (House) stuff;
                System.out.println("Address: " + roof.getAddress());
            } else if (stuff instanceof Vehicle) {
                Vehicle transportation = (Vehicle) stuff;
                System.out.println("Year & Make/Model: " + transportation.getYear() + " " + transportation.getMakeModel());
            }

            System.out.println();
        }




        }



    }
