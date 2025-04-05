package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern;

import com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern.strategy.Drive;

public class Vehicle {

    private Drive driverObj;

    public Vehicle(){};

    public Vehicle(Drive obj){
        this.driverObj = obj;
    }

    public void drive(){
        this.driverObj.drive();
    }
}
