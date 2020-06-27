package com.company;

/*Project: Car Dealership Team Project
Purpose Details: A text-based car dealership system
Course: IST 242
Author: Hasna Naz
Date Developed: 6/13/2020
Last Date Changed: 6/26/2020
Revision: 2
*/

import java.util.Scanner;
public class SalesPerson {
    /**
     * Try and get name and address
     *
     * @param name                     String
     * @param address                  string
     * @return                        name and address
     * @author                         Hasna Naz
     * @version                        1.0
     * @since                          2020-06-25
     */
    private String name;
    private String address;
    /**
     * Try and connect to the Wifi device
     *
     * @param totalSales        double
     * @param salesAssociateID  string
     * @return                  ID with sales
     * @author                  Hasna Naz
     * @version                 1.0
     * @since                  2020-06-25
     */
    private double totalSales;
    private String salesAssociateID;
    /**
     * Try and connect to the Wifi device
     *
     * @param Salary                Int
     * @param password              String
     * @return                     salary and password of salesperson
     * @author                      Hasna Naz
     * @version                     1.0
     * @since                       2020-06-25
     */
    private Integer Salary;
    private String password;
    private Boolean Active;

    // Constructor
    public SalesPerson(String n, String ad, double sales, String id, Integer salary,
                       String pword) {
        name = n;
        address = ad;
        totalSales = sales;
        salesAssociateID = id;
        password = pword;
    }

    // Getters and Setters below
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double gettotalSales() { return totalSales; }
    public void setTotalSales(double sales) { totalSales += sales; }

    public String getId() { return salesAssociateID; }

    public void setSalesAssociateID(String id) { salesAssociateID = id; }

    public Integer Salary() { return Salary; }
    public void setSalary(Integer Salary) { this.Salary = Salary; }

    public String getPassword() { return password; }
    public void setPassword(String pword) { password = pword; }

    public Boolean Active() { return Active; }
    public void setActive() { this.Active = Active; }

    public void Information() {
    }

    public void AccessInformation() {
        Scanner update = new Scanner(System.in);
        System.out.println("Enter ID: ");
    }
}

