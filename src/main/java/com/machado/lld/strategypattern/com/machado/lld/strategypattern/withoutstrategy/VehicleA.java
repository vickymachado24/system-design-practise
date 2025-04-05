package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withoutstrategy;

public class VehicleA extends Vehicle{


    //overriding basic functionality with special drive
    @Override
    public void drive(){
        System.out.println( "Special drive");
    }
    /***
     * Vehicle A & B have the same special drive which could have been reused but
     * due to Vehicle class being set up as that. Reusability goes down
     */
}
