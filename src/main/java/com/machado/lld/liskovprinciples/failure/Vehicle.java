package com.machado.lld.liskovprinciples.failure;

public class Vehicle {

    //defaulting to true
    public Boolean hasEngine(){
        return true;
    }

    //defaulting to 2
    public int getNumberOfWheels(){
        return 2;
    }
}
