package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern;

import com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern.strategy.NormalDrive;

public class VehicleC extends Vehicle{

    public VehicleC(){
        super(new NormalDrive());
    }
}
