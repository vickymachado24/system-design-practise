package com.machado.lld.strategypattern.withstrategypattern;

import com.machado.lld.strategypattern.withstrategypattern.strategy.SpecialDrive;

public class VehicleA extends Vehicle{

    public VehicleA(){
        super(new SpecialDrive());
    }
}
