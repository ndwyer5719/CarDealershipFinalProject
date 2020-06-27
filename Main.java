package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Vehicle v1 = new Vehicle("12124324");
            v1.setColor(Color.Orange);
            v1.setMake(Make.Chevy);
            Vehicle v2 = new Vehicle("12132423");
            v2.setColor(Color.Green);
            v2.setMake(Make.Ford);
            Vehicle v3 = new Vehicle("12697976");
            v3.setColor(Color.Blue);
            v3.setMake(Make.RAM);

            ArrayList<Vehicle> vehicleList = new ArrayList<>();
            vehicleList.add(v1);
            vehicleList.add(v2);
            vehicleList.add(v3);

            String vehicleId = "12697976";

            //Search string by vehicleId
            for (Vehicle v : vehicleList) {
                if (vehicleId == v.getId()) {
                    System.out.println(v.getColor());
                    break;
                }
            }

            //Update Search string by vehicleId set Color
            for (Vehicle v : vehicleList) {
                if (vehicleId == v.getId()) {
                    v.setColor(Color.Purple);
                    break;
                }
            }

            //Print all vehicle objects in ArrayList
            for (Vehicle v : vehicleList) {
                System.out.println("Id: " + v.getId() + " Make: " + v.getMake());
            }

            //Remove Search string by vehicleId set Color
            for (Vehicle v : vehicleList) {
                if (vehicleId == v.getId()) {
                    vehicleList.remove(v);
                    break;
                }
            }

            //Print all vehicle objects in ArrayList
            for (Vehicle v : vehicleList) {
                System.out.println("Id: " + v.getId() + " Make: " + v.getMake());
            }

        System.out.print("\n" + "Welcome to our Dealership!");
        Dealerships obj1 = new Dealerships();
        obj1.CustomerList();
        obj1.carInsurance();
        obj1.Transactions();
        obj1.InventoryCheck();

    }
    }
