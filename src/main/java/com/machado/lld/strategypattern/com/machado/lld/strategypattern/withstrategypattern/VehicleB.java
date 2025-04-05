package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern;

import com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern.strategy.SpecialDrive;

public class VehicleB extends Vehicle{

    public VehicleB(){
        super(new SpecialDrive());
    }
}
