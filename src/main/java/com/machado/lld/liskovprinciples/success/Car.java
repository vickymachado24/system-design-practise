package com.machado.lld.liskovprinciples.success;

public class Car extends VehicleSuccess{

    @Override
    public Integer getNumberOfWheels(){
        return 4;
    }
}
