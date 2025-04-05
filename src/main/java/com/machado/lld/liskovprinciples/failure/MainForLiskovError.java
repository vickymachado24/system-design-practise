package com.machado.lld.liskovprinciples.failure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainForLiskovError {

    public static void main(String[] args) {

        List<Vehicle> list = Arrays.asList(new Bicycle(), new Car());

        //this will give an exception as for bicycle the engine return is null
        for(Vehicle vehicle: list) System.out.println(vehicle.hasEngine().toString());
    }
}
