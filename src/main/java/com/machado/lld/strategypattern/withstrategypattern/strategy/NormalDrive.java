package com.machado.lld.strategypattern.withstrategypattern.strategy;

public class NormalDrive implements Drive {
    @Override
    public void drive() {
        System.out.println("Normal drive via interface");
    }
}
