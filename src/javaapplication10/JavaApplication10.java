/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author danie
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car("Ford","Ranger","Door,Horn,Wheel",1995,1200.35,23.5);
        
        System.out.print(car1.getList_of_features());
        System.out.print(car1.getMake());
        System.out.print(car1.getMileage());
        System.out.print(car1.getModel());
        System.out.print(car1.getSelling_price());
        System.out.print(car1.getYear());
    }
    
}
