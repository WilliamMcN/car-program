/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Car {
    //instance variables 
    private String make,model,list_of_features;
    private int year;
    private double selling_price,mileage;

    public Car(String make, String model, String list_of_features, int year, double selling_price, double mileage) {
        this.make = make;
        this.model = model;
        //year
        if((year>1800) && (year<(LocalDate.now().getYear())+1))
            this.year = year;
        else
            throw new IllegalArgumentException("Invalid Year");
        //selling price
        if(selling_price>0)
            this.selling_price = selling_price;
        else
            throw new IllegalArgumentException("Price cannot be zero or below");
        //features
        this.list_of_features = list_of_features;
        //mileage
        if(mileage>=8 && mileage<100)
            this.mileage = mileage;
        else 
            throw new IllegalArgumentException("Incorrect fuel range");
        //Constructor
        
    }
    //setters with validation 
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setList_of_features(String list_of_features) {
        this.list_of_features = list_of_features;
    }

    public void setYear(int year) {
        if(year>1800 && year>(LocalDate.now().getYear()+1))
            this.year = year;
        else
            throw new IllegalArgumentException("Invalid Year");
        
    }

    public void setSelling_price(double selling_price) {
        if(selling_price>0)
            this.selling_price = selling_price;
        else
            throw new IllegalArgumentException("Price cannot be zero or below");
    }
    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getList_of_features() {
        return list_of_features;
    }

    public int getYear() {
        return year;
    }

    public double getSelling_price() {
        return selling_price;
    }

    public double getMileage() {
        return mileage;
    }
    
    /**
     * this method will return the class as a string in the form 
     * @return 
     */
    @Override
    public String toString(){
        return (make+" "+model+" "+" "+year+" "+mileage+" "+this.selling_price+" "+this.list_of_features);
    }
}
