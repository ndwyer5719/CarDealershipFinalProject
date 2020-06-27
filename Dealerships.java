package com.company;
/*
Project: Car Dealership Project
Purpose Details: Learn how to utilize Object Oriented Programming skills
Course: IST 242
Author: Natalie Dwyer
Date Developed: 6/19/2020
Last Date Changed:6/26/2020
Revision: 2
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Dealerships {
    private String LocationName;
    private Integer locationID;
    private Integer SalesPerDay;
    private Boolean Active;
    private String Manager;
    Scanner sc = new Scanner(System.in);

    public Dealerships() {
    }
            //setters and getters
            public String getLocationName() { return LocationName; }
            public void setLocationName() { this.LocationName = LocationName; }

            public Integer getlocationID(){ return locationID; }
            public void setlocationID(){ this.locationID = locationID; }

            public Integer getSalesPerDay(){ return SalesPerDay; }
            public void setSalesPerDay(){ this.SalesPerDay = SalesPerDay; }

            public Boolean getActive(){ return Active; }
            public void setActive(){ this.Active = Active; }

            public String getManager() { return Manager;}
            public void setManager(){ this.Manager = Manager;}
    /**
     * Prints out list of customers at the dealership.
     *
     * @return              Strings
     * @author              Natalie Dwyer
     * @version             1.0
     * @since               2020-06-25
     */
            public void CustomerList() {
                int i;
                Scanner sc = new Scanner(System.in);
                System.out.println("\n" + "Enter your name: ");
                String name = sc.nextLine();
                    for (i=0; i>name.length(); i++) {
                        System.out.println(name);
                }
            }
    /**
     * Prints out list of transactions made.
     *
     * @return              integers
     * @author              Natalie Dwyer
     * @version             1.0
     * @since               2020-06-25
     */
            public void Transactions() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the amount spent on car: ");
                String trans = sc.nextLine();
                int j;
                for (j=0; j>trans.length(); j++) {
                    System.out.println(trans);
                }
            }
    /**
     * Prints out the inventory list for the Dealership.
     *
     * @return              Hashtable
     * @author              Natalie Dwyer
     * @version             1.0
     * @since               2020-06-25
     */
            public void InventoryCheck() {
                Map products = new HashMap();

                products.put("Trucks", 5);
                products.put("SUV's", 7);
                products.put("Sudan's", 13);
                products.put("Minivan's", 9);

                System.out.println("Number of products");
                System.out.println("Map products:"+products);

                Iterator<String> keySetIterator = products.keySet().iterator();

                while(keySetIterator.hasNext()){
                    String key=keySetIterator.next();
                    System.out.println("Number of " + key + ":" + products.get(key));
                }
            }

    /**
     * Shows the car insurance type the customer uses.
     *
     * @return              String
     * @author              Natalie Dwyer
     * @version             1.0
     * @since               2020-06-25
     */
            public void carInsurance() {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter what car insurance you have: ");
                String insurance = sc.nextLine();
                int z;
                for (z=0; z>insurance.length(); z++) {
                    System.out.println(insurance);
                }
            }

}


