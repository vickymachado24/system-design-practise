package com.machado.lld.liskovprinciples.failure;

public class Bicycle extends Vehicle{

    @Override
    public Boolean hasEngine(){
        return null;
    }
}
