package com.machado.lld.strategypattern.withoutstrategy;

public class VehicleB extends Vehicle{


    //overrding default drive with special drive
    @Override
    public void drive(){
        System.out.println( "Special Drive");
    }
}
