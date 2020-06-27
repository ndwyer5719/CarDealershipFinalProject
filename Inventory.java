/*
Project: Car Dealership Team Project
Purpose Details: A text-based car dealership system
Course: IST 242
Author: Elyse Swider
Date Developed: 6/13/2020
Last Date Changed: 6/21/2020
Revision: 2
 */
package com.company;

import java.util.Scanner;

public class Inventory {
        public String vehicleName;
        public Integer vehicleID;
        public Integer price;
        public String description;
        public Boolean Active;

        //setters and getters
        public String getVehicleName() {
            return vehicleName;
        }
        public void setVehicleName(String vehicleName) {
            this.vehicleName = vehicleName;
        }
        public Integer getVehicleID() {
            return vehicleID;
        }
        public void setVehicleID() {
            this.vehicleID = vehicleID;
        }
        public Integer getPrice(){
            return price;
        }
        public void setPrice(){
            this.price = price;
        }
        public String getDescription(){
            return description;
        }
        public void setDescription(){
            this.description = description;
        }
        public Boolean getActive(){
            return Active;
        }
        public void setActive(){
            this.Active = Active;
        }

        public void vehicleInventory(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the vehicle you are interested in: ");
        }
        public void searchResults(){
            System.out.println("Here is the following information regarding your search: ");
        }

    }
