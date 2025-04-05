package com.machado.lld.liskovprinciples.success;

import com.machado.lld.liskovprinciples.failure.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForLiskovSuccess {

    public static void main(String[] args) {

        List<VehicleSuccess> vehicles = Arrays.asList( new Bicycle(), new Car());

        //seperation of concerns type feel, vehicle success doesnt have engine related function atall
        //if you try to access anything related to Vehicle with engine
        //there will be a compilation error
        for( VehicleSuccess vehicleSuccess : vehicles) System.out.println( vehicleSuccess.getNumberOfWheels());

    }
}
