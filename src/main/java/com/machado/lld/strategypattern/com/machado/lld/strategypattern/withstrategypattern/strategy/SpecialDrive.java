package com.machado.lld.strategypattern.com.machado.lld.strategypattern.withstrategypattern.strategy;

public class SpecialDrive implements Drive {

    @Override
    public void drive(){
        System.out.println(" Special Drive via interface");
    }
}
