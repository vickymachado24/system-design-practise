package com.machado.lld.liskovprinciples.success;

import com.machado.lld.liskovprinciples.failure.Vehicle;

public class VehicleWithEngine extends VehicleSuccess {

    public Boolean hasEngine(){
        return true;
    }

}
