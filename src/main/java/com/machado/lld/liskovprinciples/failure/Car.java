package com.machado.lld.liskovprinciples.failure;

public class Car extends Vehicle{

    @Override
    public int getNumberOfWheels(){
        return 4;
    }
}
